package com.camunda.consulting.zeebemonitor.zeebe;

import com.camunda.consulting.zeebemonitor.entity.Broker;

public class ZeebeConnectionDto {

  private Broker broker;
  private boolean connected;

  public ZeebeConnectionDto(Broker broker, boolean connected) {
    this.broker = broker;
    this.connected = connected;
  }

  public Broker getBroker() {
    return broker;
  }

  public void setBroker(Broker broker) {
    this.broker = broker;
  }

  public boolean isConnected() {
    return connected;
  }

  public void setConnected(boolean connected) {
    this.connected = connected;
  }
}
