package io.github.bmf.consts.opcode;

import java.util.Map;

import com.google.common.collect.Maps;

public enum OpcodeType {
    //@formatter:off
    AALOAD(Opcode.AALOAD),
    AASTORE(Opcode.AASTORE),
    ACONST_NULL(Opcode.ACONST_NULL),
    ALOAD(Opcode.ALOAD),
    ALOAD_0(Opcode.ALOAD_0),
    ALOAD_1(Opcode.ALOAD_1),
    ALOAD_2(Opcode.ALOAD_2),
    ALOAD_3(Opcode.ALOAD_3),
    ANEWARRAY(Opcode.ANEWARRAY),
    ARETURN(Opcode.ARETURN),
    ARRAYLENGTH(Opcode.ARRAYLENGTH),
    ASTORE(Opcode.ASTORE),
    ASTORE_0(Opcode.ASTORE_0),
    ASTORE_1(Opcode.ASTORE_1),
    ASTORE_2(Opcode.ASTORE_2),
    ASTORE_3(Opcode.ASTORE_3),
    ATHROW(Opcode.ATHROW),
    BALOAD(Opcode.BALOAD),
    BASTORE(Opcode.BASTORE),
    BIPUSH(Opcode.BIPUSH),
    BREAKPOINT(Opcode.BREAKPOINT),
    CALOAD(Opcode.CALOAD),
    CASTORE(Opcode.CASTORE),
    CHECKCAST(Opcode.CHECKCAST),
    D2F(Opcode.D2F),
    D2I(Opcode.D2I),
    D2L(Opcode.D2L),
    DADD(Opcode.DADD),
    DALOAD(Opcode.DALOAD),
    DASTORE(Opcode.DASTORE),
    DCMPG(Opcode.DCMPG),
    DCMPL(Opcode.DCMPL),
    DCONST_0(Opcode.DCONST_0),
    DCONST_1(Opcode.DCONST_1),
    DDIV(Opcode.DDIV),
    DLOAD(Opcode.DLOAD),
    DLOAD_0(Opcode.DLOAD_0),
    DLOAD_1(Opcode.DLOAD_1),
    DLOAD_2(Opcode.DLOAD_2),
    DLOAD_3(Opcode.DLOAD_3),
    DMUL(Opcode.DMUL),
    DNEG(Opcode.DNEG),
    DREM(Opcode.DREM),
    DRETURN(Opcode.DRETURN),
    DSTORE(Opcode.DSTORE),
    DSTORE_0(Opcode.DSTORE_0),
    DSTORE_1(Opcode.DSTORE_1),
    DSTORE_2(Opcode.DSTORE_2),
    DSTORE_3(Opcode.DSTORE_3),
    DSUB(Opcode.DSUB),
    DUP2(Opcode.DUP2),
    DUP2_X1(Opcode.DUP2_X1),
    DUP2_X2(Opcode.DUP2_X2),
    DUP(Opcode.DUP),
    DUP_X1(Opcode.DUP_X1),
    DUP_X2(Opcode.DUP_X2),
    F2D(Opcode.F2D),
    F2I(Opcode.F2I),
    F2L(Opcode.F2L),
    FADD(Opcode.FADD),
    FALOAD(Opcode.FALOAD),
    FASTORE(Opcode.FASTORE),
    FCMPG(Opcode.FCMPG),
    FCMPL(Opcode.FCMPL),
    FCONST_0(Opcode.FCONST_0),
    FCONST_1(Opcode.FCONST_1),
    FCONST_2(Opcode.FCONST_2),
    FDIV(Opcode.FDIV),
    FLOAD(Opcode.FLOAD),
    FLOAD_0(Opcode.FLOAD_0),
    FLOAD_1(Opcode.FLOAD_1),
    FLOAD_2(Opcode.FLOAD_2),
    FLOAD_3(Opcode.FLOAD_3),
    FMUL(Opcode.FMUL),
    FNEG(Opcode.FNEG),
    FREM(Opcode.FREM),
    FRETURN(Opcode.FRETURN),
    FSTORE(Opcode.FSTORE),
    FSTORE_0(Opcode.FSTORE_0),
    FSTORE_1(Opcode.FSTORE_1),
    FSTORE_2(Opcode.FSTORE_2),
    FSTORE_3(Opcode.FSTORE_3),
    FSUB(Opcode.FSUB),
    GETFIELD(Opcode.GETFIELD),
    GETSTATIC(Opcode.GETSTATIC),
    GOTO(Opcode.GOTO),
    GOTO_W(Opcode.GOTO_W),
    I2B(Opcode.I2B),
    I2C(Opcode.I2C),
    I2D(Opcode.I2D),
    I2F(Opcode.I2F),
    I2L(Opcode.I2L),
    I2S(Opcode.I2S),
    IADD(Opcode.IADD),
    IALOAD(Opcode.IALOAD),
    IAND(Opcode.IAND),
    IASTORE(Opcode.IASTORE),
    ICONST_0(Opcode.ICONST_0),
    ICONST_1(Opcode.ICONST_1),
    ICONST_2(Opcode.ICONST_2),
    ICONST_3(Opcode.ICONST_3),
    ICONST_4(Opcode.ICONST_4),
    ICONST_5(Opcode.ICONST_5),
    ICONST_M1(Opcode.ICONST_M1),
    IDIV(Opcode.IDIV),
    IF_ACMPEQ(Opcode.IF_ACMPEQ),
    IF_ACMPNE(Opcode.IF_ACMPNE),
    IF_ICMPEQ(Opcode.IF_ICMPEQ),
    IF_ICMPGE(Opcode.IF_ICMPGE),
    IF_ICMPGT(Opcode.IF_ICMPGT),
    IF_ICMPLE(Opcode.IF_ICMPLE),
    IF_ICMPLT(Opcode.IF_ICMPLT),
    IF_ICMPNE(Opcode.IF_ICMPNE),
    IFEQ(Opcode.IFEQ),
    IFGE(Opcode.IFGE),
    IFGT(Opcode.IFGT),
    IFLE(Opcode.IFLE),
    IFLT(Opcode.IFLT),
    IFNE(Opcode.IFNE),
    IFNONNULL(Opcode.IFNONNULL),
    IFNULL(Opcode.IFNULL),
    IINC(Opcode.IINC),
    ILOAD(Opcode.ILOAD),
    ILOAD_0(Opcode.ILOAD_0),
    ILOAD_1(Opcode.ILOAD_1),
    ILOAD_2(Opcode.ILOAD_2),
    ILOAD_3(Opcode.ILOAD_3),
    IMPDEP1(Opcode.IMPDEP1),
    IMPDEP2(Opcode.IMPDEP2), 
    IMUL(Opcode.IMUL),
    INEG(Opcode.INEG),
    INSTANCEOF(Opcode.INSTANCEOF),
    INVOKEINTERFACE(Opcode.INVOKEINTERFACE),
    INVOKESPECIAL(Opcode.INVOKESPECIAL),
    INVOKESTATIC(Opcode.INVOKESTATIC),
    INVOKEVIRTUAL(Opcode.INVOKEVIRTUAL),
    IOR(Opcode.IOR),
    IREM(Opcode.IREM),
    IRETURN(Opcode.IRETURN),
    ISHL(Opcode.ISHL),
    ISHR(Opcode.ISHR),
    ISTORE(Opcode.ISTORE),
    ISTORE_0(Opcode.ISTORE_0),
    ISTORE_1(Opcode.ISTORE_1),
    ISTORE_2(Opcode.ISTORE_2),
    ISTORE_3(Opcode.ISTORE_3),
    ISUB(Opcode.ISUB),
    IUSHR(Opcode.IUSHR),
    IXOR(Opcode.IXOR),
    JSR(Opcode.JSR),
    JSR_W(Opcode.JSR_W),
    L2D(Opcode.L2D),
    L2F(Opcode.L2F),
    L2I(Opcode.L2I),
    LADD(Opcode.LADD),
    LALOAD(Opcode.LALOAD),
    LAND(Opcode.LAND),
    LASTORE(Opcode.LASTORE),
    LCMP(Opcode.LCMP),
    LCONST_0(Opcode.LCONST_0),
    LCONST_1(Opcode.LCONST_1),
    LDC2_W(Opcode.LDC2_W),
    LDC(Opcode.LDC),
    LDC_W(Opcode.LDC_W),
    LDIV(Opcode.LDIV),
    LLOAD(Opcode.LLOAD),
    LLOAD_0(Opcode.LLOAD_0),
    LLOAD_1(Opcode.LLOAD_1),
    LLOAD_2(Opcode.LLOAD_2),
    LLOAD_3(Opcode.LLOAD_3),
    LMUL(Opcode.LMUL),
    LNEG(Opcode.LNEG),
    LOOKUPSWITCH(Opcode.LOOKUPSWITCH),
    LOR(Opcode.LOR),
    LREM(Opcode.LREM),
    LRETURN(Opcode.LRETURN),
    LSHL(Opcode.LSHL),
    LSHR(Opcode.LSHR),
    LSTORE(Opcode.LSTORE),
    LSTORE_0(Opcode.LSTORE_0),
    LSTORE_1(Opcode.LSTORE_1),
    LSTORE_2(Opcode.LSTORE_2),
    LSTORE_3(Opcode.LSTORE_3),
    LSUB(Opcode.LSUB),
    LUSHR(Opcode.LUSHR),
    LXOR(Opcode.LXOR),
    MONITORENTER(Opcode.MONITORENTER),
    MONITOREXIT(Opcode.MONITOREXIT),
    MULTIANEWARRAY(Opcode.MULTIANEWARRAY),
    NEW(Opcode.NEW),
    NEWARRAY(Opcode.NEWARRAY),
    NOP(Opcode.NOP),
    POP2(Opcode.POP2),
    POP(Opcode.POP),
    PUTFIELD(Opcode.PUTFIELD),
    PUTSTATIC(Opcode.PUTSTATIC),
    RET(Opcode.RET),
    RETURN(Opcode.RETURN),
    SALOAD(Opcode.SALOAD),
    SASTORE(Opcode.SASTORE),
    SIPUSH(Opcode.SIPUSH),
    SWAP(Opcode.SWAP),
    TABLESWITCH(Opcode.TABLESWITCH),
    WIDE(Opcode.WIDE);
    //@formatter:on 

    /**
     * Map of values to types.
     */
    private static Map<Integer, OpcodeType> typeMap;
    private final int value;

    OpcodeType(int value) {
        this.value = value;
        register(this);
    }

    /**
     * Retrieves an OpcodeType instance from a value.
     * 
     * @param value
     * @return
     */
    public static OpcodeType fromValue(int value) {
        return typeMap.get(value);
    }

    /**
     * Registers the OpcodeType's value to an instance.
     *
     * @param type
     */
    private void register(OpcodeType type) {
        if (typeMap == null) {
            typeMap = Maps.newHashMap();
        }
        typeMap.put(type.value, type);
    }

    public int getValue() {
        return value;
    }

}