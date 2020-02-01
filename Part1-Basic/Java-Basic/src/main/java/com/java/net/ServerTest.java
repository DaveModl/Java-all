package com.java.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 通过数据流从客户端接收信息
 * 解码信息
 * 收集客户端请求
 * 输出流发送给客户端
 */
public class ServerTest {
    public static void main(String[] args) throws IOException {
        try(ServerSocket serverSocket = new ServerSocket(8189)){
            try(Socket socket = serverSocket.accept()){
                InputStream ins = socket.getInputStream();
                OutputStream outs = socket.getOutputStream();
                try(Scanner in = new Scanner(ins,"UTF-8")){
                    PrintWriter out = new PrintWriter(new OutputStreamWriter(outs,"UTF-8"),true);
                    out.println("Hello client..");

                    boolean done = false;
                    while (!done && in.hasNextLine()){
                        String line = in.nextLine();
                        out.println("Echo: " + line);
                        if (line.trim().equals("BYE")){
                            done = true;
                        }
                    }
                }
            }
        }
    }
}
