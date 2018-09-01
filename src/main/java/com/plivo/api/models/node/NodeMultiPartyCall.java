package com.plivo.api.models.node;

public class NodeMultiPartyCall extends Node {

  private NodeMultiPartyCallMember member;

  public NodeMultiPartyCallMember getMember() {
    return member;
  }

  public NodeTriggerApiAction call(final String triggerSource, final String to,
                                   final String role) {
    return update(NodeActionType.CALL, NodeType.MULTI_PARTY_CALL, triggerSource, to, role);
  }

  public NodeTriggerApiAction warmTransfer(final String triggerSource, final String to,
                                           final String role) {
    return update(NodeActionType.WARMTRANSFER, NodeType.MULTI_PARTY_CALL, triggerSource, to, role);
  }

  public NodeTriggerApiAction coldTransfer(final String triggerSource, final String to,
                                           final String role) {
    return update(NodeActionType.COLDTRANSFER, NodeType.MULTI_PARTY_CALL, triggerSource, to, role);
  }

  public NodeMultiPartyCallMember member(final String memberId) {
    return new NodeMultiPartyCallMember(getPhloId(), NodeType.MULTI_PARTY_CALL, getNodeId(), memberId);
  }
}
