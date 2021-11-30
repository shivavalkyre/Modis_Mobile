
package com.modis;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class asradiobutton {
    public static RemoteObject myClass;
	public asradiobutton() {
	}
    public static PCBA staticBA = new PCBA(null, asradiobutton.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("Object");
public static RemoteObject _mbase = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _tag = RemoteObject.declareNull("Object");
public static RemoteObject _xpnl_background = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _xpnl_dot = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _g_checked_background_color = RemoteObject.createImmutable(0);
public static RemoteObject _g_unchecked_background_color = RemoteObject.createImmutable(0);
public static RemoteObject _g_disabled_checked_background_color = RemoteObject.createImmutable(0);
public static RemoteObject _g_disabled_unchecked_background_color = RemoteObject.createImmutable(0);
public static RemoteObject _g_enabled = RemoteObject.createImmutable(false);
public static RemoteObject _g_checked = RemoteObject.createImmutable(false);
public static RemoteObject _g_border_width = RemoteObject.createImmutable(0);
public static RemoteObject _g_animation = RemoteObject.createImmutable("");
public static RemoteObject _g_haptic = RemoteObject.createImmutable(false);
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
		return new Object[] {"DateUtils",_ref.getField(false, "_dateutils"),"g_Animation",_ref.getField(false, "_g_animation"),"g_border_width",_ref.getField(false, "_g_border_width"),"g_checked",_ref.getField(false, "_g_checked"),"g_checked_background_color",_ref.getField(false, "_g_checked_background_color"),"g_disabled_checked_background_color",_ref.getField(false, "_g_disabled_checked_background_color"),"g_disabled_unchecked_background_color",_ref.getField(false, "_g_disabled_unchecked_background_color"),"g_enabled",_ref.getField(false, "_g_enabled"),"g_Haptic",_ref.getField(false, "_g_haptic"),"g_unchecked_background_color",_ref.getField(false, "_g_unchecked_background_color"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"Tag",_ref.getField(false, "_tag"),"xpnl_background",_ref.getField(false, "_xpnl_background"),"xpnl_dot",_ref.getField(false, "_xpnl_dot"),"xui",_ref.getField(false, "_xui")};
}
}