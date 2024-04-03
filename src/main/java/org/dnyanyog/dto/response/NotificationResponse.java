package org.dnyanyog.dto.response;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;
import org.springframework.stereotype.Component;

@Component
public class NotificationResponse {

  @NotNull(message = "Status should not be Null ")
  private String status;

  @NotBlank(message = "Code should not be Null")
  private String code;

  @NotNull(message = "Message should not be Null")
  private String message;

  private LocalDateTime timestamp;

  public static NotificationResponse getInstance() {
    return new NotificationResponse();
  }

  public String getStatus() {
    return status;
  }

  public NotificationResponse setStatus(String status) {
    this.status = status;
    return this;
  }

  public String getCode() {
    return code;
  }

  public NotificationResponse setCode(String string) {
    this.code = string;
    return this;
  }

  public String getMessage() {
    return message;
  }

  public NotificationResponse setMessage(String message) {
    this.message = message;
    return this;
  }

  public LocalDateTime getTimestamp() {
    return timestamp;
  }

  public NotificationResponse setTimestamp(LocalDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }
}
