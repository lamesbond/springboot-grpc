package com.liubusi.grpcserver.service;

import com.axin.test.grpcserver.TestGrpcServiceGrpc;
import com.axin.test.grpcserver.TestReply;
import com.axin.test.grpcserver.TestRequest;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;

/**
 * @Author axin
 **/

// 旧版本的注解需要制定类名，写法为@GrpcService(DeviceFixServiceGrpc.class)
@GrpcService
public class TestGrpcService extends TestGrpcServiceGrpc.TestGrpcServiceImplBase {

    // 重写proto中的方法
    @Override
    public void testMethod(TestRequest request, StreamObserver<TestReply> responseObserver) {
        // grpc服务端获取调用端请求参数
        String id = request.getId();
        String name = request.getName();
        // 这里可以有自己的业务代码，只需要按照porto中的返回类型返回参数即可
        TestReply res = TestReply.newBuilder().setRes("id:"+id+",name:"+name).build();
        responseObserver.onNext(res);
        responseObserver.onCompleted();
    }

}