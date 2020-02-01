package com.java.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * 多客户端连接
 */
public class MultiClientServer {
    public static void main(String[] args) throws IOException {
        try(ServerSocket serverSocket = new ServerSocket(8189)){
            int i = 1;
            while (true){
                Socket socket = serverSocket.accept();
                System.out.println("UserId" + i);
                Runnable runnable = new ThreadHandler(socket);
                new Thread(runnable).start();
                i++;
            }
        }
    }
}

class ThreadHandler implements Runnable{
    private Socket socket;

    public ThreadHandler(Socket socket) {
        this.socket = socket;
    }


    @Override
    public void run() {
        try(InputStream ins = socket.getInputStream();
            OutputStream outs = socket.getOutputStream()){
            Scanner in = new Scanner(ins,"UTF-8");
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
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}