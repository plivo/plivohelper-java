package com.plivo.api.models.node;

public class NodeActionPayload {

  private String triggerSource;
  private String to;
  private String role;
  private NodeActionType action;

  /**
   *
   * @param triggerSource the number triggering the action.
   * @param to to number.
   * @param role role of the node.
   * @param action one of the node action types.
   */
  public NodeActionPayload(final String triggerSource, final String to,
      final String role, final NodeActionType action) {
    this.triggerSource = triggerSource;
    this.to = to;
    this.role = role;
    this.action = action;
  }

  public String getTriggerSource() {
    return triggerSource;
  }

  public String getTo() {
    return to;
  }

  public String getRole() {
    return role;
  }

  public NodeActionType getAction() {
    return action;
  }
}
