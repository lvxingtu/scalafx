/*
 * Copyright (c) 2011-2013, ScalaFX Project
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *     * Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions and the following disclaimer in the
 *       documentation and/or other materials provided with the distribution.
 *     * Neither the name of the ScalaFX Project nor the
 *       names of its contributors may be used to endorse or promote products
 *       derived from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE SCALAFX PROJECT OR ITS CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED
 * AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package scalafx.colorselector

import scalafx.scene.paint.Color
import scalafx.scene.paint.Color._
import scalafx.util.StringConverter

object WebColor {

  val colors = List(
    WebColor("ALICEBLUE", ALICEBLUE),
    WebColor("ANTIQUEWHITE", ANTIQUEWHITE),
    WebColor("AQUA", AQUA),
    WebColor("AQUAMARINE", AQUAMARINE),
    WebColor("AZURE", AZURE),
    WebColor("BEIGE", BEIGE),
    WebColor("BISQUE", BISQUE),
    WebColor("BLACK", BLACK),
    WebColor("BLANCHEDALMOND", BLANCHEDALMOND),
    WebColor("BLUE", BLUE),
    WebColor("BLUEVIOLET", BLUEVIOLET),
    WebColor("BROWN", BROWN),
    WebColor("BURLYWOOD", BURLYWOOD),
    WebColor("CADETBLUE", CADETBLUE),
    WebColor("CHARTREUSE", CHARTREUSE),
    WebColor("CHOCOLATE", CHOCOLATE),
    WebColor("CORAL", CORAL),
    WebColor("CORNFLOWERBLUE", CORNFLOWERBLUE),
    WebColor("CORNSILK", CORNSILK),
    WebColor("CRIMSON", CRIMSON),
    WebColor("CYAN", CYAN),
    WebColor("DARKBLUE", DARKBLUE),
    WebColor("DARKCYAN", DARKCYAN),
    WebColor("DARKGOLDENROD", DARKGOLDENROD),
    WebColor("DARKGRAY", DARKGRAY),
    WebColor("DARKGREEN", DARKGREEN),
    WebColor("DARKGREY", DARKGREY),
    WebColor("DARKKHAKI", DARKKHAKI),
    WebColor("DARKMAGENTA", DARKMAGENTA),
    WebColor("DARKOLIVEGREEN", DARKOLIVEGREEN),
    WebColor("DARKORANGE", DARKORANGE),
    WebColor("DARKORCHID", DARKORCHID),
    WebColor("DARKRED", DARKRED),
    WebColor("DARKSALMON", DARKSALMON),
    WebColor("DARKSEAGREEN", DARKSEAGREEN),
    WebColor("DARKSLATEBLUE", DARKSLATEBLUE),
    WebColor("DARKSLATEGRAY", DARKSLATEGRAY),
    WebColor("DARKSLATEGREY", DARKSLATEGREY),
    WebColor("DARKTURQUOISE", DARKTURQUOISE),
    WebColor("DARKVIOLET", DARKVIOLET),
    WebColor("DEEPPINK", DEEPPINK),
    WebColor("DEEPSKYBLUE", DEEPSKYBLUE),
    WebColor("DIMGRAY", DIMGRAY),
    WebColor("DIMGREY", DIMGREY),
    WebColor("DODGERBLUE", DODGERBLUE),
    WebColor("FIREBRICK", FIREBRICK),
    WebColor("FLORALWHITE", FLORALWHITE),
    WebColor("FORESTGREEN", FORESTGREEN),
    WebColor("FUCHSIA", FUCHSIA),
    WebColor("GAINSBORO", GAINSBORO),
    WebColor("GHOSTWHITE", GHOSTWHITE),
    WebColor("GOLD", GOLD),
    WebColor("GOLDENROD", GOLDENROD),
    WebColor("GRAY", GRAY),
    WebColor("GREEN", GREEN),
    WebColor("GREENYELLOW", GREENYELLOW),
    WebColor("GREY", GREY),
    WebColor("HONEYDEW", HONEYDEW),
    WebColor("HOTPINK", HOTPINK),
    WebColor("INDIANRED", INDIANRED),
    WebColor("INDIGO", INDIGO),
    WebColor("IVORY", IVORY),
    WebColor("KHAKI", KHAKI),
    WebColor("LAVENDER", LAVENDER),
    WebColor("LAVENDERBLUSH", LAVENDERBLUSH),
    WebColor("LAWNGREEN", LAWNGREEN),
    WebColor("LEMONCHIFFON", LEMONCHIFFON),
    WebColor("LIGHTBLUE", LIGHTBLUE),
    WebColor("LIGHTCORAL", LIGHTCORAL),
    WebColor("LIGHTCYAN", LIGHTCYAN),
    WebColor("LIGHTGOLDENRODYELLOW", LIGHTGOLDENRODYELLOW),
    WebColor("LIGHTGRAY", LIGHTGRAY),
    WebColor("LIGHTGREEN", LIGHTGREEN),
    WebColor("LIGHTGREY", LIGHTGREY),
    WebColor("LIGHTPINK", LIGHTPINK),
    WebColor("LIGHTSALMON", LIGHTSALMON),
    WebColor("LIGHTSEAGREEN", LIGHTSEAGREEN),
    WebColor("LIGHTSKYBLUE", LIGHTSKYBLUE),
    WebColor("LIGHTSLATEGRAY", LIGHTSLATEGRAY),
    WebColor("LIGHTSLATEGREY", LIGHTSLATEGREY),
    WebColor("LIGHTSTEELBLUE", LIGHTSTEELBLUE),
    WebColor("LIGHTYELLOW", LIGHTYELLOW),
    WebColor("LIME", LIME),
    WebColor("LIMEGREEN", LIMEGREEN),
    WebColor("LINEN", LINEN),
    WebColor("MAGENTA", MAGENTA),
    WebColor("MAROON", MAROON),
    WebColor("MEDIUMAQUAMARINE", MEDIUMAQUAMARINE),
    WebColor("MEDIUMBLUE", MEDIUMBLUE),
    WebColor("MEDIUMORCHID", MEDIUMORCHID),
    WebColor("MEDIUMPURPLE", MEDIUMPURPLE),
    WebColor("MEDIUMSEAGREEN", MEDIUMSEAGREEN),
    WebColor("MEDIUMSLATEBLUE", MEDIUMSLATEBLUE),
    WebColor("MEDIUMSPRINGGREEN", MEDIUMSPRINGGREEN),
    WebColor("MEDIUMTURQUOISE", MEDIUMTURQUOISE),
    WebColor("MEDIUMVIOLETRED", MEDIUMVIOLETRED),
    WebColor("MIDNIGHTBLUE", MIDNIGHTBLUE),
    WebColor("MINTCREAM", MINTCREAM),
    WebColor("MISTYROSE", MISTYROSE),
    WebColor("MOCCASIN", MOCCASIN),
    WebColor("NAVAJOWHITE", NAVAJOWHITE),
    WebColor("NAVY", NAVY),
    WebColor("OLDLACE", OLDLACE),
    WebColor("OLIVE", OLIVE),
    WebColor("OLIVEDRAB", OLIVEDRAB),
    WebColor("ORANGE", ORANGE),
    WebColor("ORANGERED", ORANGERED),
    WebColor("ORCHID", ORCHID),
    WebColor("PALEGOLDENROD", PALEGOLDENROD),
    WebColor("PALEGREEN", PALEGREEN),
    WebColor("PALETURQUOISE", PALETURQUOISE),
    WebColor("PALEVIOLETRED", PALEVIOLETRED),
    WebColor("PAPAYAWHIP", PAPAYAWHIP),
    WebColor("PEACHPUFF", PEACHPUFF),
    WebColor("PERU", PERU),
    WebColor("PINK", PINK),
    WebColor("PLUM", PLUM),
    WebColor("POWDERBLUE", POWDERBLUE),
    WebColor("PURPLE", PURPLE),
    WebColor("RED", RED),
    WebColor("ROSYBROWN", ROSYBROWN),
    WebColor("ROYALBLUE", ROYALBLUE),
    WebColor("SADDLEBROWN", SADDLEBROWN),
    WebColor("SALMON", SALMON),
    WebColor("SANDYBROWN", SANDYBROWN),
    WebColor("SEAGREEN", SEAGREEN),
    WebColor("SEASHELL", SEASHELL),
    WebColor("SIENNA", SIENNA),
    WebColor("SILVER", SILVER),
    WebColor("SKYBLUE", SKYBLUE),
    WebColor("SLATEBLUE", SLATEBLUE),
    WebColor("SLATEGRAY", SLATEGRAY),
    WebColor("SLATEGREY", SLATEGREY),
    WebColor("SNOW", SNOW),
    WebColor("SPRINGGREEN", SPRINGGREEN),
    WebColor("STEELBLUE", STEELBLUE),
    WebColor("TAN", TAN),
    WebColor("TEAL", TEAL),
    WebColor("THISTLE", THISTLE),
    WebColor("TOMATO", TOMATO),
    WebColor("TRANSPARENT", TRANSPARENT),
    WebColor("TURQUOISE", TURQUOISE),
    WebColor("VIOLET", VIOLET),
    WebColor("WHEAT", WHEAT),
    WebColor("WHITE", WHITE),
    WebColor("WHITESMOKE", WHITESMOKE),
    WebColor("YELLOW", YELLOW),
    WebColor("YELLOWGREEN", YELLOWGREEN))

}

/**
 * Represents pre-defined colors defined in [[scalafx.scene.paint.Color]] Object.
 * 
 * @constructor Creates a new WebColor
 * @param name Color Name
 * @param color Color
 */
sealed case class WebColor(name: String, color: Color) {

  /**
   * Verifies if a determined color is equivalent to color represented by this WebColor.
   */
  def sameColor(c: Color) =
    ((c.red == color.red) && (c.green == color.green) && (c.blue == color.blue))
}