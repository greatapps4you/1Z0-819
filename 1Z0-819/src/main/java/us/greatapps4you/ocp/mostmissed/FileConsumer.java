package us.greatapps4you.ocp.mostmissed;

import java.io.File;
import java.security.AccessControlContext;
import java.security.AccessController;
import java.security.Permission;
import java.security.PermissionCollection;
import java.security.PrivilegedAction;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FileConsumer {

	private final List<File> dir;

	public FileConsumer(List<File> dir) {
		super();
		this.dir = dir;
	}

	public <R> List<R> executeFunctionOriginal(Function<File, R> fun) {
		List<R> l = new ArrayList<R>();
		for (File f : dir) {
			l.add(fun.apply(f));
		}
		return l;
	}

	public <R> List<R> executeFunctionPrivileged(Function<File, R> fun) {
		List<R> l = new ArrayList<R>();
		for (File f : dir) {
			AccessController.doPrivileged(new PrivilegedAction<Void>() {
				public Void run() {
					l.add(fun.apply(f));
					return null;
				}
			});
		}
		return l;
	}

	public <R> List<R> executeFunctionPrivilegedProtectionDomainRead(Function<File, R> fun) {
		List<R> l = new ArrayList<R>();
		for (File f : dir) {
			Permission perm = new java.io.FilePermission(f.getPath(), "read");
			PermissionCollection perms = perm.newPermissionCollection();
			perms.add(perm);
			AccessController.doPrivileged(new PrivilegedAction<Void>() {
				public Void run() {
					l.add(fun.apply(f));
					return null;
				}
			}, new AccessControlContext(new ProtectionDomain[] { new ProtectionDomain(null, perms) }));
		}
		return l;
	}

	/**
	 * This is the only way to ensure that the caller only reads a file and is not
	 * able to overwrite or delete it irrespective of what level of permission the
	 * caller has.
	 */
	public <R> List<R> executeFunctionPrivilegedReadPermission(Function<File, R> fun) {
		List<R> l = new ArrayList<R>();
		for (File f : dir) {
			Permission perm = new java.io.FilePermission(f.getPath(), "read");
			AccessController.checkPermission(perm);
			AccessController.doPrivileged(new PrivilegedAction<Void>() {
				public Void run() {
					l.add(fun.apply(f));
					return null;
				}
			});
		}
		return l;
	}

}
