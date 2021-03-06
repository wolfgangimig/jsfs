package com.wilutions.jsfs;

/*
 * Serializer for com.wilutions.jsfs.FormItem
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStruct DO NOT MODIFY.
 */

import byps.*;

// DEBUG
// isEnum=false
// isFinal=false
// isInline=false
// #members=3

// checkpoint byps.gen.j.GenSerStruct:274
@SuppressWarnings("all")
public class BSerializer_979378962 extends BSerializer {
	
	public final static BSerializer instance = new BSerializer_979378962();
	
	public BSerializer_979378962() {
		super(979378962);
	}
	
	public BSerializer_979378962(int typeId) {
		super(typeId);
	}
	
	
	@Override
	public void write(final Object obj1, final BOutput bout1, final long version) throws BException {
		final FormItem obj = (FormItem)obj1;		
		final BOutputBin bout = (BOutputBin)bout1;
		final BBufferBin bbuf = bout.bbuf;
		bbuf.putString(obj.name);
		bbuf.putString(obj.type);
		bbuf.putString(obj.value);
	}
	
	@Override
	public Object read(final Object obj1, final BInput bin1, final long version) throws BException {
		final BInputBin bin = (BInputBin)bin1;
		final FormItem obj = (FormItem)(obj1 != null ? obj1 : bin.onObjectCreated(new FormItem()));
		
		final BBufferBin bbuf = bin.bbuf;
		
		obj.name = bbuf.getString();
		obj.type = bbuf.getString();
		obj.value = bbuf.getString();
		
		return obj;
	}
	
}
