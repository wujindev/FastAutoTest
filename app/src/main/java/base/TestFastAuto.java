package base;

import testqq.TestContacts;
import testqq.TestMessage;
import yph.base.FastAuto;
import yph.bean.Configure;
import yph.bean.TestBean;


public class TestFastAuto {
    public static void main(String[] args) {
        FastAuto.run(Configure.get()
//                .setAdb("adb")
//                .setNode("node")
//                .setApkPath("C:/Users/dell1/android-studio/workspace/workspace-2018/AppiumAutoTest/app/apk/app-debug.apk")
                .setAppPackage("com.tencent.mobileqq")
                .setAppActivity("com.tencent.mobileqq.activity.SplashActivity")
                .setAppiumMainJs("C:/Users/dell1/AppData/Local/Programs/appium-desktop/resources/app/node_modules/appium/build/lib/main.js")
                .addTestBean(new TestBean().setName("testqq").setClasses(new Class[]{TestMessage.class, TestContacts.class})));
    }
}