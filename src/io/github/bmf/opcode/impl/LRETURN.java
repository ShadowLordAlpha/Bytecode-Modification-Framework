package io.github.bmf.opcode.impl;

import io.github.bmf.opcode.AbstractRETURN;
import io.github.bmf.opcode.Opcode;
import io.github.bmf.opcode.OpcodeType;
import io.github.bmf.type.Type;

public class LRETURN extends AbstractRETURN {
    public LRETURN() {
        super(OpcodeType.RETURN, Opcode.LRETURN, Type.LONG);
    }
}
