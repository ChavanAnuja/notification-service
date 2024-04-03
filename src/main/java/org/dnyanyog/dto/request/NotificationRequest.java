package org.dnyanyog.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.stereotype.Component;

@Component
public class NotificationRequest {

  @NotNull(message = "Client Id should not be Null")
  private String clientId;

  @NotNull(message = "Mode should not be Null")
  private String mode;

  @NotNull(message = "Subject should not be Null")
  @Size(min = 5, max = 50, message = "Subject should be Minimum 5 to 50 characters")
  private String subject;

  @NotNull(message = "Body should not be Null")
  @Size(min = 5, max = 50, message = "Body should be Minimum 5 to 50 characters")
  private String body;

  @NotNull(message = "Footer should not be Null")
  @Size(min = 5, max = 50, message = "Footer should be Minimum 5 to 50 characters")
  private String footer;

  @NotNull(message = "From should not null ")
  @Email
  private String from;

  @NotNull(message = "To should not Null")
  @Email
  private String to;

  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public String getFooter() {
    return footer;
  }

  public void setFooter(String footer) {
    this.footer = footer;
  }

  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }
}
