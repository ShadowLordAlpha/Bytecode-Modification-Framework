package me.coley.bmf.opcode.impl;

import me.coley.bmf.opcode.AbstractRETURN;
import me.coley.bmf.opcode.Opcode;
import me.coley.bmf.opcode.OpcodeType;
import me.coley.bmf.type.Type;

public class LRETURN extends AbstractRETURN {
    public LRETURN() {
        super(OpcodeType.RETURN, Opcode.LRETURN, Type.LONG);
    }
}
