package com.fcc.util;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.OutputStream;
import java.io.PrintWriter;

import java.text.DateFormat;

import java.text.SimpleDateFormat;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class IFLogger {
    public static OutputStream fosLog = null;

    public IFLogger() {
    }

    public static void getFileInfo() {
        String confp = "";
        String userId = null;
        String pwd = null;
        String connStr = null;
        String logPath = null;
        String qConnectionFactory = null;
        String init_ctx_factory = null;
        String provider_url = null;
        String async_threads = null;
        String pool_type = null;
        String err_q_name = null;
        String security_pricipal = null;
        String security_credential = null;
        String dateformat = null;

        String path = System.getProperty("user.home");
        if (path.equals("/"))
            confp = path + "GWInfo.prop"; //Configuration File Name
        else
            confp = path + File.separator + "GWInfo.prop";

        File f = new File(confp);
        System.out.println(path);
        System.out.println(confp);
        try {
            if (f.exists()) {
                System.out.println("Inside IF");
                Properties props = new Properties();
                props.load(new FileInputStream(f));
                userId = props.getProperty("ID");
                pwd = props.getProperty("PWD").trim();
                connStr = props.getProperty("CONNECT");
                logPath = props.getProperty("LOG_PATH");
                //security_pricipal=props.getProperty("SECURITY_PRINCIPAL");
                security_credential =
                        props.getProperty("SECURITY_CREDENTIALS");
                dateformat = props.getProperty("DATEFORMAT");
                if (dateformat != null) {
                    System.setProperty("DATEFORMAT", dateformat);
                } else {
                    System.setProperty("DATEFORMAT", "yyyy/MM/dd HH:mm:ss");
                }

                if (userId != null)
                    System.setProperty("ID", userId);

                if (pwd != null)
                    System.setProperty("PWD", pwd);

                if (connStr != null)
                    System.setProperty("CONNECT", connStr);

                if (logPath != null)
                    System.setProperty("LOG_PATH", logPath);
                else
                    System.setProperty("LOG_PATH", "\tmp");

                logPath = logPath.replace('\\', '/');
                if (!logPath.endsWith("/"))
                    logPath += "/";

                if (pool_type != null)
                    System.setProperty("USE_POOL", pool_type);
                else
                    System.setProperty("USE_POOL", "OWNPOOL");

            }
        } catch (Exception e) {

            System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }


    /*--------------------------------------------------------------------------------------*/

    /**
            This method is used to write messages to a log file.
            @param logMessage   The log message content
            @param logFile      The log file name object
            @return void
     */
    /*--------------------------------------------------------------------------------------*/
    public static void jLog(String logMessage, String logFile)

    {
        try {
            String timestamp = getTime();
            PrintWriter pwLog = new PrintWriter(new FileWriter(logFile, true));
            logMessage = timestamp + logMessage;
            pwLog.println(logMessage);
            pwLog.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    } //End of jLog

    /*--------------------------------------------------------------------------------------*/

    /**
            This method is used to get the log file path
            @param logFiles     The logFiles
            @param direction    The direction of the service (In or Out)
            @return String
     */
    /*--------------------------------------------------------------------------------------*/
    public static String getLogPath(String logFiles, String direction) {
        String logPath = "";
        String logFile = "";
        try {
            /* Set the new log file name*/
            logPath = System.getProperty("LOG_PATH");
            java.util.Date date = new java.util.Date();
            logFile = logPath + logFiles + date.getTime() + ".txt";
            /* Create a new log file*/
            fosLog = new FileOutputStream(logFile, false);
            jLog("", logFile);
            jLog("*****************    " + date +
                 "    *********************************", logFile);
            jLog("", logFile);
            jLog(".Starting A New " + direction + " Process ", logFile);
            jLog(".Trying To Connect To The Database", logFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return logFile;
    }


    /*--------------------------------------------------------------------------------------*/

    /**
            This method is used for returing the File object stream
            @return OutputStream
     */
    /*--------------------------------------------------------------------------------------*/
    public OutputStream getFileOutputStream() {
        return fosLog;
    }

    public static String getTime() {
        DateFormat dateFormat =
            new SimpleDateFormat(System.getProperty("DATEFORMAT"));
        java.util.Date date = new java.util.Date();
        try {
            String datetime = dateFormat.format(date);
            return datetime;
        } finally {
            date = null;
        }


    }
}


