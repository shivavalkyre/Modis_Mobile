package com.modis.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_home{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panel11").vw.setLeft((int)((50d / 100 * width)-(views.get("panel11").vw.getWidth())/2d));
//BA.debugLineNum = 6;BA.debugLine="Panel11.Top = Panel10.Top-Panel11.Height/2"[Home/General script]
views.get("panel11").vw.setTop((int)((views.get("panel10").vw.getTop())-(views.get("panel11").vw.getHeight())/2d));
//BA.debugLineNum = 7;BA.debugLine="ASRadioButton1.Left=10dip"[Home/General script]
views.get("asradiobutton1").vw.setLeft((int)((10d * scale)));
//BA.debugLineNum = 8;BA.debugLine="Label7.Left=ASRadioButton1.Left+ASRadioButton1.Width+10dip"[Home/General script]
views.get("label7").vw.setLeft((int)((views.get("asradiobutton1").vw.getLeft())+(views.get("asradiobutton1").vw.getWidth())+(10d * scale)));
//BA.debugLineNum = 10;BA.debugLine="ASRadioButton2.Left=Label7.Left+Label7.Width"[Home/General script]
views.get("asradiobutton2").vw.setLeft((int)((views.get("label7").vw.getLeft())+(views.get("label7").vw.getWidth())));
//BA.debugLineNum = 11;BA.debugLine="Label8.Left=ASRadioButton2.Left+ASRadioButton2.Width+10dip"[Home/General script]
views.get("label8").vw.setLeft((int)((views.get("asradiobutton2").vw.getLeft())+(views.get("asradiobutton2").vw.getWidth())+(10d * scale)));
//BA.debugLineNum = 13;BA.debugLine="ASRadioButton3.Left=Label8.Left+Label8.Width+10dip"[Home/General script]
views.get("asradiobutton3").vw.setLeft((int)((views.get("label8").vw.getLeft())+(views.get("label8").vw.getWidth())+(10d * scale)));
//BA.debugLineNum = 15;BA.debugLine="ASRadioButton3.Left=Label8.Left+Label8.Width"[Home/General script]
views.get("asradiobutton3").vw.setLeft((int)((views.get("label8").vw.getLeft())+(views.get("label8").vw.getWidth())));
//BA.debugLineNum = 16;BA.debugLine="Label14.Left=ASRadioButton3.Left+ ASRadioButton3.Width+10dip"[Home/General script]
views.get("label14").vw.setLeft((int)((views.get("asradiobutton3").vw.getLeft())+(views.get("asradiobutton3").vw.getWidth())+(10d * scale)));
//BA.debugLineNum = 19;BA.debugLine="ASRadioButton4.Left =Label14.Left+Label14.Width"[Home/General script]
views.get("asradiobutton4").vw.setLeft((int)((views.get("label14").vw.getLeft())+(views.get("label14").vw.getWidth())));
//BA.debugLineNum = 20;BA.debugLine="Label15.Left = ASRadioButton4.Left+ASRadioButton4.Width+10dip"[Home/General script]
views.get("label15").vw.setLeft((int)((views.get("asradiobutton4").vw.getLeft())+(views.get("asradiobutton4").vw.getWidth())+(10d * scale)));
//BA.debugLineNum = 22;BA.debugLine="ASRadioButton5.Left =ASRadioButton1.Left"[Home/General script]
views.get("asradiobutton5").vw.setLeft((int)((views.get("asradiobutton1").vw.getLeft())));
//BA.debugLineNum = 23;BA.debugLine="ASRadioButton5.Top=ASRadioButton1.Top+ASRadioButton1.Height+20dip"[Home/General script]
views.get("asradiobutton5").vw.setTop((int)((views.get("asradiobutton1").vw.getTop())+(views.get("asradiobutton1").vw.getHeight())+(20d * scale)));
//BA.debugLineNum = 24;BA.debugLine="Label16.Left = ASRadioButton5.Left+ASRadioButton5.Width+10dip"[Home/General script]
views.get("label16").vw.setLeft((int)((views.get("asradiobutton5").vw.getLeft())+(views.get("asradiobutton5").vw.getWidth())+(10d * scale)));
//BA.debugLineNum = 25;BA.debugLine="Label16.Top=ASRadioButton5.top"[Home/General script]
views.get("label16").vw.setTop((int)((views.get("asradiobutton5").vw.getTop())));
//BA.debugLineNum = 39;BA.debugLine="Label10.Left=0%x"[Home/General script]
views.get("label10").vw.setLeft((int)((0d / 100 * width)));
//BA.debugLineNum = 40;BA.debugLine="Label11.Left=Label10.Left+Label10.Width"[Home/General script]
views.get("label11").vw.setLeft((int)((views.get("label10").vw.getLeft())+(views.get("label10").vw.getWidth())));
//BA.debugLineNum = 41;BA.debugLine="Label12.Left=Label11.Left+Label11.Width"[Home/General script]
views.get("label12").vw.setLeft((int)((views.get("label11").vw.getLeft())+(views.get("label11").vw.getWidth())));
//BA.debugLineNum = 42;BA.debugLine="Label13.Left = Panel13.Width-Label13.Width"[Home/General script]
views.get("label13").vw.setLeft((int)((views.get("panel13").vw.getWidth())-(views.get("label13").vw.getWidth())));
//BA.debugLineNum = 44;BA.debugLine="ImageView2.Left = Panel11.Left-ImageView2.Width-60dip"[Home/General script]
views.get("imageview2").vw.setLeft((int)((views.get("panel11").vw.getLeft())-(views.get("imageview2").vw.getWidth())-(60d * scale)));
//BA.debugLineNum = 45;BA.debugLine="ImageView3.Left=Panel11.Left+Panel11.Width+60dip"[Home/General script]
views.get("imageview3").vw.setLeft((int)((views.get("panel11").vw.getLeft())+(views.get("panel11").vw.getWidth())+(60d * scale)));
//BA.debugLineNum = 47;BA.debugLine="Panel4.Left=50%x-Panel4.Width/2"[Home/General script]
views.get("panel4").vw.setLeft((int)((50d / 100 * width)-(views.get("panel4").vw.getWidth())/2d));
//BA.debugLineNum = 48;BA.debugLine="Panel4.Top=50%y-Panel4.Height/2"[Home/General script]
views.get("panel4").vw.setTop((int)((50d / 100 * height)-(views.get("panel4").vw.getHeight())/2d));
//BA.debugLineNum = 50;BA.debugLine="ImageView4.Left=(Panel5.Width/2)-ImageView4.Width/2"[Home/General script]
views.get("imageview4").vw.setLeft((int)(((views.get("panel5").vw.getWidth())/2d)-(views.get("imageview4").vw.getWidth())/2d));
//BA.debugLineNum = 51;BA.debugLine="ImageView5.Left=(Panel6.Width/2)-(ImageView5.Width/2)"[Home/General script]
views.get("imageview5").vw.setLeft((int)(((views.get("panel6").vw.getWidth())/2d)-((views.get("imageview5").vw.getWidth())/2d)));

}
}