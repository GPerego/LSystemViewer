// Generated from LSystemDescriptor.g4 by ANTLR 4.6
package model.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LSystemDescriptorParser}.
 */
public interface LSystemDescriptorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LSystemDescriptorParser#description}.
	 * @param ctx the parse tree
	 */
	void enterDescription(LSystemDescriptorParser.DescriptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSystemDescriptorParser#description}.
	 * @param ctx the parse tree
	 */
	void exitDescription(LSystemDescriptorParser.DescriptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSystemDescriptorParser#alphabet}.
	 * @param ctx the parse tree
	 */
	void enterAlphabet(LSystemDescriptorParser.AlphabetContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSystemDescriptorParser#alphabet}.
	 * @param ctx the parse tree
	 */
	void exitAlphabet(LSystemDescriptorParser.AlphabetContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSystemDescriptorParser#symbolWithCommand}.
	 * @param ctx the parse tree
	 */
	void enterSymbolWithCommand(LSystemDescriptorParser.SymbolWithCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSystemDescriptorParser#symbolWithCommand}.
	 * @param ctx the parse tree
	 */
	void exitSymbolWithCommand(LSystemDescriptorParser.SymbolWithCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSystemDescriptorParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(LSystemDescriptorParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSystemDescriptorParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(LSystemDescriptorParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSystemDescriptorParser#axiom}.
	 * @param ctx the parse tree
	 */
	void enterAxiom(LSystemDescriptorParser.AxiomContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSystemDescriptorParser#axiom}.
	 * @param ctx the parse tree
	 */
	void exitAxiom(LSystemDescriptorParser.AxiomContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSystemDescriptorParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterRules(LSystemDescriptorParser.RulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSystemDescriptorParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitRules(LSystemDescriptorParser.RulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSystemDescriptorParser#singleRule}.
	 * @param ctx the parse tree
	 */
	void enterSingleRule(LSystemDescriptorParser.SingleRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSystemDescriptorParser#singleRule}.
	 * @param ctx the parse tree
	 */
	void exitSingleRule(LSystemDescriptorParser.SingleRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSystemDescriptorParser#settings}.
	 * @param ctx the parse tree
	 */
	void enterSettings(LSystemDescriptorParser.SettingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSystemDescriptorParser#settings}.
	 * @param ctx the parse tree
	 */
	void exitSettings(LSystemDescriptorParser.SettingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSystemDescriptorParser#angle}.
	 * @param ctx the parse tree
	 */
	void enterAngle(LSystemDescriptorParser.AngleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSystemDescriptorParser#angle}.
	 * @param ctx the parse tree
	 */
	void exitAngle(LSystemDescriptorParser.AngleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LSystemDescriptorParser#size}.
	 * @param ctx the parse tree
	 */
	void enterSize(LSystemDescriptorParser.SizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LSystemDescriptorParser#size}.
	 * @param ctx the parse tree
	 */
	void exitSize(LSystemDescriptorParser.SizeContext ctx);
}