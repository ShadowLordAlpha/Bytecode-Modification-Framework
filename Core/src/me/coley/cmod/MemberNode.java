package me.coley.cmod;

import me.coley.cmod.attribute.Attribute;
import me.coley.cmod.attribute.AttributeDeprecated;
import me.coley.cmod.attribute.AttributeSignature;
import me.coley.cmod.attribute.AttributeSynthetic;
import me.coley.cmod.attribute.IAttributeOwner;
import me.coley.cmod.attribute.annotation.AttributeAnnotations;
import me.coley.cmod.attribute.annotation.AttributeParameterAnnotations;

/**
 * A member. Implementation is either a field or method.
 * 
 * @author Matt
 *
 */
public abstract class MemberNode implements IAttributeOwner {
	/**
	 * The class the member belongs to.
	 */
	public final ClassNode owner;
	/**
	 * Access. May be multiple combined.
	 */
	public int access;
	/**
	 * Index in the constant pool pointing to the member's name.
	 */
	public int name;
	/**
	 * Index in the constant pool pointing to the member's desc.
	 */
	public int desc;
	/**
	 * Attribute: If not-null, the member is deprecated.
	 */
	public AttributeDeprecated deprecated;
	/**
	 * Attribute: If not-null, the member is synthetic.
	 */
	public AttributeSynthetic synthetic;
	/**
	 * Attribute: Signature for generic information.
	 */
	public AttributeSignature signature;
	/**
	 * Attribute: Annotations
	 */
	public AttributeAnnotations runtimeInvisibleAnnotations;
	/**
	 * Attribute: Annotations
	 */
	public AttributeAnnotations runtimeVisibleAnnotations;
	/**
	 * Attribute: Annotations
	 */
	public AttributeParameterAnnotations runtimeInvisibleParamAnnotations;
	/**
	 * Attribute: Annotations
	 */
	public AttributeParameterAnnotations runtimeVisibleParamAnnotations;

	/**
	 * Creates the node and sets its owner.
	 * 
	 * @param owner
	 */
	public MemberNode(ClassNode owner) {
		this.owner = owner;
	}

	@Override
	public void addAttribute(Attribute attribute) {
		switch (attribute.type) {
		case SYNTHETIC:
			synthetic = (AttributeSynthetic) attribute;
			break;
		case SIGNATURE:
			signature = (AttributeSignature) attribute;
			break;
		case DEPRECATED:
			deprecated = (AttributeDeprecated) attribute;
			break;
		case RUNTIME_INVISIBLE_ANNOTATIONS:
			runtimeInvisibleAnnotations = (AttributeAnnotations) attribute;
			break;
		case RUNTIME_INVISIBLE_PARAMETER_ANNOTATIONS:
			runtimeVisibleAnnotations = (AttributeAnnotations) attribute;
			break;
		case RUNTIME_VISIBLE_ANNOTATIONS:
			runtimeVisibleParamAnnotations = (AttributeParameterAnnotations) attribute;
			break;
		case RUNTIME_VISIBLE_PARAMETER_ANNOTATIONS:
			runtimeInvisibleParamAnnotations = (AttributeParameterAnnotations) attribute;
			break;
		default:
			break;
		}
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName().replace("Node", "") + ": " + access + " , " + name + " , " + desc;
	}
}
