package main.java.com.gosvea.iccpra.pojo;

import lombok.Data;

@Data
public class Result<T> {
    private Integer code;
    private String message;
    private T data;

    public static <E> Result<E> success(E data) {
        return new Result<>(0, "Success", data);
    }

    public static Result success() {
        return new Result<>(0, "success", null);
    }

    public static Result error(String message) {
        return new Result(1, message, null);
    }
}
