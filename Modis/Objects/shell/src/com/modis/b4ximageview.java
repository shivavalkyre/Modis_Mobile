
package com.modis;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4ximageview {
    public static RemoteObject myClass;
	public b4ximageview() {
	}
    public static PCBA staticBA = new PCBA(null, b4ximageview.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _iv = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _mresizemode = RemoteObject.createImmutable("");
public static RemoteObject _mround = RemoteObject.createImmutable(false);
public static RemoteObject _mbitmap = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.B4XBitmapWrapper");
public static RemoteObject _mbackgroundcolor = RemoteObject.createImmutable(0);
public static RemoteObject _mcornersradius = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.modis.main _main = null;
public static com.modis.starter _starter = null;
public static com.modis.general _general = null;
public static com.modis.register _register = null;
public static com.modis.home _home = null;
public static com.modis.absensi _absensi = null;
public static com.modis.xuiviewsutils _xuiviewsutils = null;
public static com.modis.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"DateUtils",_ref.getField(false, "_dateutils"),"iv",_ref.getField(false, "_iv"),"mBackgroundColor",_ref.getField(false, "_mbackgroundcolor"),"mBase",_ref.getField(false, "_mbase"),"mBitmap",_ref.getField(false, "_mbitmap"),"mCallBack",_ref.getField(false, "_mcallback"),"mCornersRadius",_ref.getField(false, "_mcornersradius"),"mEventName",_ref.getField(false, "_meventname"),"mResizeMode",_ref.getField(false, "_mresizemode"),"mRound",_ref.getField(false, "_mround"),"Tag",_ref.getField(false, "_tag"),"xui",_ref.getField(false, "_xui")};
}
}