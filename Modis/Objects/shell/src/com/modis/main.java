
package com.modis;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "com.modis.main");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
public static RemoteObject _url_login = RemoteObject.createImmutable("");
public static RemoteObject _edittext1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _edittext2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _label6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _button1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.modis.starter _starter = null;
public static com.modis.general _general = null;
public static com.modis.register _register = null;
public static com.modis.home _home = null;
public static com.modis.absensi _absensi = null;
public static com.modis.xuiviewsutils _xuiviewsutils = null;
public static com.modis.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"Absensi",Debug.moduleToString(com.modis.absensi.class),"Activity",main.mostCurrent._activity,"Button1",main.mostCurrent._button1,"DateUtils",main.mostCurrent._dateutils,"EditText1",main.mostCurrent._edittext1,"EditText2",main.mostCurrent._edittext2,"general",Debug.moduleToString(com.modis.general.class),"Home",Debug.moduleToString(com.modis.home.class),"HttpUtils2Service",Debug.moduleToString(com.modis.httputils2service.class),"Label6",main.mostCurrent._label6,"Register",Debug.moduleToString(com.modis.register.class),"rp",main._rp,"Starter",Debug.moduleToString(com.modis.starter.class),"url_login",main._url_login,"xui",main._xui,"XUIViewsUtils",Debug.moduleToString(com.modis.xuiviewsutils.class)};
}
}