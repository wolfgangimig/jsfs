package com.wilutions.jsfs;

/*
 * Serializer for com.wilutions.jsfs.BStub_FileSystemNotify
 * 
 * THIS FILE HAS BEEN GENERATED BY class byps.gen.j.GenSerStub DO NOT MODIFY.
 */

import byps.*;
@SuppressWarnings("all")
public class JSerializer_544795964 extends JSerializer_16 {
	
	public final static BSerializer instance = new JSerializer_544795964();
	
	public JSerializer_544795964() {
		super(544795964);
	}
	
	@Override
	public BRemote internalCreate(final BTransport transport) throws BException {
		return new BStub_FileSystemNotify(transport);
	}
	
}