package com.modis.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_absensi{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[Absensi/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 6;BA.debugLine="Label1.Top=100%y-Label1.Height -10dip"[Absensi/General script]
views.get("label1").vw.setTop((int)((100d / 100 * height)-(views.get("label1").vw.getHeight())-(10d * scale)));
//BA.debugLineNum = 7;BA.debugLine="Label1.Left = 50%x-Label1.Width/2"[Absensi/General script]
views.get("label1").vw.setLeft((int)((50d / 100 * width)-(views.get("label1").vw.getWidth())/2d));

}
}