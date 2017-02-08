// Generated from LSystemDescriptor.g4 by ANTLR 4.6
package model.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LSystemDescriptorParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LSystemDescriptorVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LSystemDescriptorParser#description}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescription(LSystemDescriptorParser.DescriptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSystemDescriptorParser#alphabet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlphabet(LSystemDescriptorParser.AlphabetContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSystemDescriptorParser#symbolWithCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSymbolWithCommand(LSystemDescriptorParser.SymbolWithCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSystemDescriptorParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(LSystemDescriptorParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSystemDescriptorParser#axiom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAxiom(LSystemDescriptorParser.AxiomContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSystemDescriptorParser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRules(LSystemDescriptorParser.RulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSystemDescriptorParser#singleRule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleRule(LSystemDescriptorParser.SingleRuleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSystemDescriptorParser#settings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSettings(LSystemDescriptorParser.SettingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSystemDescriptorParser#angle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAngle(LSystemDescriptorParser.AngleContext ctx);
	/**
	 * Visit a parse tree produced by {@link LSystemDescriptorParser#size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize(LSystemDescriptorParser.SizeContext ctx);
}