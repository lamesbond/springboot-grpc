package com.liubusi.grpcclient.service;

import com.axin.test.grpcclient.TestGrpcServiceGrpc;
import com.axin.test.grpcclient.TestReply;
import com.axin.test.grpcclient.TestRequest;
import io.grpc.Channel;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;


/**
 * @Author axin
 **/
@Service
public class TestGrpcService {

    /**
     * 这里不同的版本写法也是不同，低版本得到的是channel，再去获取ServiceStub
     * 这里的stub有三种
     * ServiceBlockingStub、GrpcServiceFutureStub、GrpcServiceStub
     * 对应的是了3种Contract：
     *  BlockingStub，阻塞式
     *  FutureStub，guava的ListenableFuture
     *  Stub，支持StreamObserver
     */

//    这里填的要和配置文件里的一样，grpc.client.grpcserver.address=static://127.0.0.1:30081
    @GrpcClient("grpcserver")
    TestGrpcServiceGrpc.TestGrpcServiceBlockingStub stub;

    public String test(){
        TestRequest request = TestRequest.newBuilder().setId("aaaer").setName("bbb").build();
        TestReply reply = stub.testMethod(request);
        return "那边的结果："+reply.getRes();
    }
}