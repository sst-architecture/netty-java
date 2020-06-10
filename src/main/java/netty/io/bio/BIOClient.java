package netty.io.bio;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.UUID;

public class BIOClient {
    public static void main(String[] args)  throws  Exception {
        //要和谁进行通信，服务器IP、服务器的端口
        //一台机器的端口号是有限
        Socket client = new Socket("localhost", 8080);

        OutputStream outputStream = client.getOutputStream();

        //生成一个随机 UUID
        String name = UUID.randomUUID().toString();

        System.out.println("客户端发送数据：" + name);

        outputStream.write(name.getBytes());

        outputStream.close();
        client.close();


    }
}
