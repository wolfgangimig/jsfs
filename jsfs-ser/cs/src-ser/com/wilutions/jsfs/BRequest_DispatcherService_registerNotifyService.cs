﻿//
// 
// THIS FILE HAS BEEN GENERATED. DO NOT MODIFY.
//

using System;
using System.Collections.Generic;
using byps;

namespace com.wilutions.jsfs
{
	
	public sealed class BRequest_DispatcherService_registerNotifyService : BMethodRequest, BSerializable
	{
	
		#region Execute
		
		public override int getRemoteId() { return 1153231042; }
		
		public override void execute(BRemote __byps__remote, BAsyncResultIF<Object> __byps__asyncResult) {
			// checkpoint byps.gen.cs.GenApiClass:406
			try {
				DispatcherService __byps__remoteT = (DispatcherService)__byps__remote;				
				BAsyncResultSendMethod<Object> __byps__outerResult = new BAsyncResultSendMethod<Object>(__byps__asyncResult, new BResult_19());				
				__byps__remoteT.RegisterNotifyService(tokenValue, serviceValue, BAsyncResultHelper.ToDelegate(__byps__outerResult));
			} catch (Exception e) {
				__byps__asyncResult.setAsyncResult(null, e);
			}
		}		
		
		#endregion
		
		#region Fields
		
		internal String tokenValue;

		internal FileSystemNotify serviceValue;

		#endregion
		
		
		public static readonly long serialVersionUID = 1849102471L;		
	} // end class
}  // end namespace
