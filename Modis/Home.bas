B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=11
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: True
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	'Private B4XRadioButton1 As B4XRadioButton
	'Private ScrollView1 As ScrollView
	Private Drawer As B4XDrawer
	Private Label7 As Label
	Private Label8 As Label
	Private Label14 As Label
	Private ASRadioButton1 As ASRadioButton
	Private ASRadioButton2 As ASRadioButton
	Private ASRadioButton3 As ASRadioButton
	Private ASRadioButton5 As ASRadioButton
	Private ASRadioButton4 As ASRadioButton
	Private Label16 As Label
	Private Label6 As Label
	Private Panel3 As Panel
	Private Panel12 As Panel
	Private Panel1 As Panel
	Private Label19 As Label
	Private Label20 As Label
	Private ImageView4 As ImageView
	Private ImageView5 As ImageView
	Private Label2 As Label
	Private LabelCloseSidebar As Label
	Private CLVSidebar As CustomListView
	Private LblisiSidebar As Label
	Private ImageViewSidebar As ImageView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example
	Dim jo As JavaObject
	Dim window As JavaObject = jo.InitializeContext.RunMethod("getWindow", Null)
	window.RunMethod("addFlags", Array(Bit.Or(0x00000200, 0x08000000)))
	Activity.Height = Activity.Height + 24dip
	Drawer.Initialize(Me, "Drawer", Activity, 280dip)
	Drawer.CenterPanel.LoadLayout("Home")
	Drawer.LeftPanel.LoadLayout("LayoutDrawer")
	
	Dim i As Int =0
	For i=0 To 4
	CLVSidebar.Add(CreateListItem(CLVSidebar.AsView.Width,CLVSidebar.AsView.Height,i),i)
	Next
	
	'Activity.LoadLayout("Home")
	'ACRadioButton1.setco
	'ScrollView1.Panel.LoadLayout("LayoutScroll")
	'ScrollView1.Panel.Height=1000dip
End Sub

Sub CreateListItem(Width As Int, Height As Int,i As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	p.SetLayout(0, 0, Width, 60dip)
	p.LoadLayout("LayoutIsIDrawer")
	Select Case i
		Case 0
			LblisiSidebar.Text="Jadwal"
			ImageViewSidebar.Bitmap= LoadBitmap(File.DirAssets,"Group 286.png")
		Case 1
			LblisiSidebar.Text="Lembur"
		Case 2
			LblisiSidebar.Text="Dinas"
		Case 3
			LblisiSidebar.Text="Cuti"
		Case 4
			LblisiSidebar.Text="Sakit"
	End Select
	Return p
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Private Sub Label7_Click
	ASRadioButton1.Checked = True
End Sub

Private Sub Label8_Click
	ASRadioButton2.Checked = True
End Sub

Private Sub Label14_Click
	ASRadioButton3.Checked = True
End Sub

Private Sub Label15_Click
	ASRadioButton4.Checked = True
End Sub

Private Sub Label16_Click
	ASRadioButton5.Checked = True
End Sub

Private Sub Label6_Click
	'StartActivity(Absensi)
	Panel1.SendToBack
	Panel12.SendToBack
	Panel3.BringToFront
	Panel3.SetVisibleAnimated(200,True)
End Sub

Private Sub ImageView4_Click
	Panel3.SetVisibleAnimated(200,False)
	StartActivity(Absensi)
End Sub

Private Sub ImageView5_Click
	Panel3.SetVisibleAnimated(200,False)
		StartActivity(Absensi)
End Sub

Private Sub Panel3_Touch (Action As Int, X As Float, Y As Float)
	Panel3.SetVisibleAnimated(200,False)
End Sub

Private Sub Label2_Click
	Drawer.LeftOpen=True
End Sub

Private Sub LabelCloseSidebar_Click
	Drawer.LeftOpen=False
End Sub