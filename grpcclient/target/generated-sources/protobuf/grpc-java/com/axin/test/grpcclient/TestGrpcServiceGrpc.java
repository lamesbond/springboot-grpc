package com.axin.test.grpcclient;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * grpc的方法
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.36.0)",
    comments = "Source: test1.proto")
public final class TestGrpcServiceGrpc {

  private TestGrpcServiceGrpc() {}

  public static final String SERVICE_NAME = "TestGrpcService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.axin.test.grpcclient.TestRequest,
      com.axin.test.grpcclient.TestReply> getTestMethodMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "testMethod",
      requestType = com.axin.test.grpcclient.TestRequest.class,
      responseType = com.axin.test.grpcclient.TestReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.axin.test.grpcclient.TestRequest,
      com.axin.test.grpcclient.TestReply> getTestMethodMethod() {
    io.grpc.MethodDescriptor<com.axin.test.grpcclient.TestRequest, com.axin.test.grpcclient.TestReply> getTestMethodMethod;
    if ((getTestMethodMethod = TestGrpcServiceGrpc.getTestMethodMethod) == null) {
      synchronized (TestGrpcServiceGrpc.class) {
        if ((getTestMethodMethod = TestGrpcServiceGrpc.getTestMethodMethod) == null) {
          TestGrpcServiceGrpc.getTestMethodMethod = getTestMethodMethod =
              io.grpc.MethodDescriptor.<com.axin.test.grpcclient.TestRequest, com.axin.test.grpcclient.TestReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "testMethod"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axin.test.grpcclient.TestRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.axin.test.grpcclient.TestReply.getDefaultInstance()))
              .setSchemaDescriptor(new TestGrpcServiceMethodDescriptorSupplier("testMethod"))
              .build();
        }
      }
    }
    return getTestMethodMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TestGrpcServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestGrpcServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestGrpcServiceStub>() {
        @java.lang.Override
        public TestGrpcServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestGrpcServiceStub(channel, callOptions);
        }
      };
    return TestGrpcServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TestGrpcServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestGrpcServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestGrpcServiceBlockingStub>() {
        @java.lang.Override
        public TestGrpcServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestGrpcServiceBlockingStub(channel, callOptions);
        }
      };
    return TestGrpcServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TestGrpcServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TestGrpcServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TestGrpcServiceFutureStub>() {
        @java.lang.Override
        public TestGrpcServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TestGrpcServiceFutureStub(channel, callOptions);
        }
      };
    return TestGrpcServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * grpc的方法
   * </pre>
   */
  public static abstract class TestGrpcServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void testMethod(com.axin.test.grpcclient.TestRequest request,
        io.grpc.stub.StreamObserver<com.axin.test.grpcclient.TestReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestMethodMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getTestMethodMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.axin.test.grpcclient.TestRequest,
                com.axin.test.grpcclient.TestReply>(
                  this, METHODID_TEST_METHOD)))
          .build();
    }
  }

  /**
   * <pre>
   * grpc的方法
   * </pre>
   */
  public static final class TestGrpcServiceStub extends io.grpc.stub.AbstractAsyncStub<TestGrpcServiceStub> {
    private TestGrpcServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestGrpcServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestGrpcServiceStub(channel, callOptions);
    }

    /**
     */
    public void testMethod(com.axin.test.grpcclient.TestRequest request,
        io.grpc.stub.StreamObserver<com.axin.test.grpcclient.TestReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestMethodMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * grpc的方法
   * </pre>
   */
  public static final class TestGrpcServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<TestGrpcServiceBlockingStub> {
    private TestGrpcServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestGrpcServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestGrpcServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.axin.test.grpcclient.TestReply testMethod(com.axin.test.grpcclient.TestRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestMethodMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * grpc的方法
   * </pre>
   */
  public static final class TestGrpcServiceFutureStub extends io.grpc.stub.AbstractFutureStub<TestGrpcServiceFutureStub> {
    private TestGrpcServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TestGrpcServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TestGrpcServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.axin.test.grpcclient.TestReply> testMethod(
        com.axin.test.grpcclient.TestRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestMethodMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_TEST_METHOD = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TestGrpcServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TestGrpcServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_TEST_METHOD:
          serviceImpl.testMethod((com.axin.test.grpcclient.TestRequest) request,
              (io.grpc.stub.StreamObserver<com.axin.test.grpcclient.TestReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class TestGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TestGrpcServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.axin.test.grpcclient.Test1.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TestGrpcService");
    }
  }

  private static final class TestGrpcServiceFileDescriptorSupplier
      extends TestGrpcServiceBaseDescriptorSupplier {
    TestGrpcServiceFileDescriptorSupplier() {}
  }

  private static final class TestGrpcServiceMethodDescriptorSupplier
      extends TestGrpcServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TestGrpcServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (TestGrpcServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TestGrpcServiceFileDescriptorSupplier())
              .addMethod(getTestMethodMethod())
              .build();
        }
      }
    }
    return result;
  }
}
