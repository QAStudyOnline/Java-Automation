package online.qastudy.api.dto;

import java.util.Objects;

public class UserResponse {
    private Long code;
    private String type;
    private String message;

    public UserResponse() {
    }

    public UserResponse(Long code, String type, String message) {
        this.code = code;
        this.type = type;
        this.message = message;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserResponse that = (UserResponse) o;
        return code.equals(that.code) &&
                type.equals(that.type) &&
                message.equals(that.message);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "UserResponse{" +
                "code=" + code +
                ", type='" + type + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
