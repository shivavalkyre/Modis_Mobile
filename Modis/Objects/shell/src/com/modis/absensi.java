
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

public class absensi implements IRemote{
	public static absensi mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public absensi() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("absensi"), "com.modis.absensi");
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
		pcBA = new PCBA(this, absensi.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _frontcamera = RemoteObject.createImmutable(false);
public static RemoteObject _rp = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
public static RemoteObject _cam = RemoteObject.declareNull("com.modis.camex2");
public static RemoteObject _mytaskindex = RemoteObject.createImmutable(0);
public static RemoteObject _pnlcamera = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _videomode = RemoteObject.createImmutable(false);
public static RemoteObject _videofiledir = RemoteObject.createImmutable("");
public static RemoteObject _videofilename = RemoteObject.createImmutable("");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.modis.main _main = null;
public static com.modis.starter _starter = null;
public static com.modis.general _general = null;
public static com.modis.register _register = null;
public static com.modis.home _home = null;
public static com.modis.xuiviewsutils _xuiviewsutils = null;
public static com.modis.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",absensi.mostCurrent._activity,"cam",absensi.mostCurrent._cam,"DateUtils",absensi.mostCurrent._dateutils,"frontCamera",absensi._frontcamera,"general",Debug.moduleToString(com.modis.general.class),"Home",Debug.moduleToString(com.modis.home.class),"HttpUtils2Service",Debug.moduleToString(com.modis.httputils2service.class),"Main",Debug.moduleToString(com.modis.main.class),"MyTaskIndex",absensi._mytaskindex,"pnlCamera",absensi.mostCurrent._pnlcamera,"Register",Debug.moduleToString(com.modis.register.class),"rp",absensi._rp,"Starter",Debug.moduleToString(com.modis.starter.class),"VideoFileDir",absensi.mostCurrent._videofiledir,"VideoFileName",absensi.mostCurrent._videofilename,"VideoMode",absensi._videomode,"XUIViewsUtils",Debug.moduleToString(com.modis.xuiviewsutils.class)};
}
}