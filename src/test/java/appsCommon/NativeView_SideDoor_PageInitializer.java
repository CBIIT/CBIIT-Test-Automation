package appsCommon;

public class NativeView_SideDoor_PageInitializer {

    public static NativeView_SideDoor_Login_Page nativeView_SideDoor_Login_Page;
    public static NativeView_SideDoor_Dashboard_Page nativeView_sideDoor_dashboard_page;

    public static void initialize_Side_Door_Pages() {
        nativeView_SideDoor_Login_Page = new NativeView_SideDoor_Login_Page();
        nativeView_sideDoor_dashboard_page = new NativeView_SideDoor_Dashboard_Page();
    }
}
