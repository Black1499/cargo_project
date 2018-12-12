package com.lzx.vo.response;

public interface ResponseBuilder<T> {

    ResponseBuilder buildPage(int page);
    ResponseBuilder buildData(T data);
    ResponseBuilder buildError(String error);

    ResponseBuilder OK();
    ResponseBuilder OK(int page);
    ResponseBuilder OK(int page,T data);

    ResponseBuilder Error();
    ResponseBuilder Error(String message);
}
