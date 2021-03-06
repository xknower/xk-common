package com.xknower.web.jx.three;

import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.BrowserPreferences;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;

import javax.swing.*;
import java.awt.*;

/**
 * The sample demonstrates how to configure user-agent string
 * for all Browser instances.
 */
public class UserAgent {
    public static void main(String[] args) {
        // The user-agent string can be modified only once, before you create any Browser instances.
        // You can provide your own user-agent string using the BrowserPreferences.setUserAgent(String userAgent) method
        // or via the jxbrowser.chromium.user-agent Java System Property:
        // It's very important to configure user-agent string
        // before any Browser instance is created.
        BrowserPreferences.setUserAgent("My User Agent String");

        Browser browser = new Browser();
        BrowserView browserView = new BrowserView(browser);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(browserView, BorderLayout.CENTER);
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        browser.loadURL("http://whatsmyuseragent.com/");
    }
}
