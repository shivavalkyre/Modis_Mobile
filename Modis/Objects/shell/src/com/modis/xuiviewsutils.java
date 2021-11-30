
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

public class xuiviewsutils implements IRemote{
	public static xuiviewsutils mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public xuiviewsutils() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, xuiviewsutils.class);
    static {
		mostCurrent = new xuiviewsutils();
        remoteMe = RemoteObject.declareNull("com.modis.xuiviewsutils");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("xuiviewsutils"), "com.modis.xuiviewsutils");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("com.modis.xuiviewsutils"), new java.lang.ref.WeakReference<PCBA> (pcBA));
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
public static RemoteObject _utilsinitialized = RemoteObject.createImmutable(false);
public static RemoteObject _xui = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.modis.main _main = null;
public static com.modis.starter _starter = null;
public static com.modis.general _general = null;
public static com.modis.register _register = null;
public static com.modis.home _home = null;
public static com.modis.absensi _absensi = null;
public static com.modis.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"Absensi",Debug.moduleToString(com.modis.absensi.class),"DateUtils",xuiviewsutils.mostCurrent._dateutils,"general",Debug.moduleToString(com.modis.general.class),"Home",Debug.moduleToString(com.modis.home.class),"HttpUtils2Service",Debug.moduleToString(com.modis.httputils2service.class),"Main",Debug.moduleToString(com.modis.main.class),"Register",Debug.moduleToString(com.modis.register.class),"Starter",Debug.moduleToString(com.modis.starter.class),"UtilsInitialized",xuiviewsutils._utilsinitialized,"xui",xuiviewsutils._xui};
}
}