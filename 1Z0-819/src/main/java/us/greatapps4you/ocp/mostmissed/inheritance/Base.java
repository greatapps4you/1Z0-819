package us.greatapps4you.ocp.mostmissed.inheritance;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

class Base {
	public <T extends CharSequence> Collection<String> transform(Collection<T> list) {
		return new ArrayList<String>();
	}
}

//Possible answer??? //4 and //5 can be inserted independently in the code.
// Not even coding this made the answer clear

class Derived extends Base {
	/**
	 * The method transform(Collection<String>) of type Derived must override or
	 * implement a supertype method
	 */
//	@Override
//	 public Collection<String> transform(Collection<String> list) { return new
//	 HashSet<String>(); }; //1

	/**
	 * The method transform(Collection<T>) of type Derived must override or
	 * implement a supertype method
	 */
//	@Override
//	 public <T extends String> Collection<T> transform(Collection<T> list) {
//	 return new HashSet<T>();}; //2

	/**
	 * The return type is incompatible with Base.transform(Collection<T>)
	 */
//	@Override
//	 public <T extends CharSequence> List<T> transform(Collection<T> list) {
//	 return new ArrayList<T>(); }; //3

	/**
	 * The method transform(List<T>) of type Derived must override or implement a
	 * supertype method
	 */
//	@Override
//	public <T extends CharSequence> Collection<T> transform(List<T> list) {
//		return new HashSet<T>();
//	}; // 4

	/**
	 * The method transform(List<String>) of type Derived must override or implement
	 * a supertype method
	 */
//	@Override
//	 public <T super String> Collection<T> transform(List<String> list) { 
//		return new HashSet<T>();};// 5

	/**
	 * The method transform(Collection<CharSequence>) of type Derived must override
	 * or implement a supertype method
	 */
//	@Override
//	public Collection<CharSequence> transform(Collection<CharSequence> list) {
//	return new HashSet<CharSequence>();}; //6 }
}