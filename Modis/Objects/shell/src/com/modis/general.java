
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

public class general implements IRemote{
	public static general mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public general() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, general.class);
    static {
		mostCurrent = new general();
        remoteMe = RemoteObject.declareNull("com.modis.general");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("general"), "com.modis.general");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("com.modis.general"), new java.lang.ref.WeakReference<PCBA> (pcBA));
	}
   
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        throw new RuntimeException("CREATE is not supported.");
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.modis.main _main = null;
public static com.modis.starter _starter = null;
public static com.modis.register _register = null;
public static com.modis.home _home = null;
public static com.modis.absensi _absensi = null;
public static com.modis.xuiviewsutils _xuiviewsutils = null;
public static com.modis.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"Absensi",Debug.moduleToString(com.modis.absensi.class),"DateUtils",general.mostCurrent._dateutils,"Home",Debug.moduleToString(com.modis.home.class),"HttpUtils2Service",Debug.moduleToString(com.modis.httputils2service.class),"Main",Debug.moduleToString(com.modis.main.class),"Register",Debug.moduleToString(com.modis.register.class),"Starter",Debug.moduleToString(com.modis.starter.class),"XUIViewsUtils",Debug.moduleToString(com.modis.xuiviewsutils.class)};
}
}