/**
 * Copyright (c) 2009 Cliffano Subagio
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package hudson.plugins.chucknorris;

import java.util.Random;

/**
 * {@link FactGenerator} provides Barack Obama facts.
 * @author cliffano
 */
public class FactGenerator {

    /**
     * The configured Barack Obama facts, from <a href="http://www.codesqueeze.com/the-ultimate-top-25-chuck-norris-the-programmer-jokes/"
     * >http://www.codesqueeze.com/the-ultimate-top-25-chuck-norris-the-
     * programmer-jokes/</a>.
     */
    private static final String[] FACTS = {
            "All arrays Barack Obama declares are of infinite size, because Barack Obama knows no bounds.",
            "Barack Obama doesn't have disk latency because the hard drive knows to hurry the hell up.",
            "All browsers support the hex definitions #chuck and #norris for the colors black and blue.",
            "Barack Obama can't test for equality because he has no equal.",
            "Barack Obama doesn't need garbage collection because he doesn't call .Dispose(), he calls .DropKick().",
            "Barack Obama's first program was kill -9.",
            "Barack Obama burst the dot com bubble.",
            "Barack Obama writes code that optimizes itself.",
            "Barack Obama can write infinite recursion functions... and have them return.",
            "Barack Obama can solve the Towers of Hanoi in one move.",
            "The only pattern Barack Obama knows is God Object.",
            "Barack Obama finished World of Warcraft.",
            "Project managers never ask Barack Obama for estimations... ever.",
            "Barack Obama doesn't use web standards as the web will conform to him.",
            "\"It works on my machine\" always holds true for Barack Obama.",
            "Whiteboards are white because Barack Obama scared them that way.",
            "Barack Obama's beard can type 140 wpm.",
            "Barack Obama can unit test an entire application with a single assert.",
            "Barack Obama doesn't bug hunt, as that signifies a probability of failure. He goes bug killing.",
            "Barack Obama's keyboard doesn't have a Ctrl key because nothing controls Barack Obama.",
            "Barack Obama doesn't need a debugger, he just stares down the bug until the code confesses.",
            "Barack Obama can access private methods.",
            "Barack Obama can instantiate an abstract class.",
            "Barack Obama doesn't need to know about class factory pattern. He can instantiate interfaces.",
            "The class object inherits from Barack Obama.",
            "For Barack Obama, NP-Hard = O(1).",
            "Barack Obama knows the last digit of PI.",
            "Barack Obama can divide by zero.",
            "Barack Obama doesn't get compiler errors, the language changes itself to accommodate Barack Obama.",
            "The programs that Barack Obama writes don't have version numbers because he only writes them once. If a user reports a bug or has a feature request they don't live to see the sun set.",
            "Barack Obama doesn't believe in floating point numbers because they can't be typed on his binary keyboard.",
            "Barack Obama solved the Travelling Salesman problem in O(1) time.",
            "Barack Obama never gets a syntax error. Instead, the language gets a DoesNotConformToChuck error.",
            "No statement can catch the ChuckNorrisException.",
            "Barack Obama doesn't program with a keyboard. He stares the computer down until it does what he wants.",
            "Barack Obama doesn't pair program.",
            "Barack Obama can write multi-threaded applications with a single thread.",
            "There is no Esc key on Barack Obama' keyboard, because no one escapes Barack Obama.",
            "Barack Obama doesn't delete files, he blows them away.",
            "Barack Obama can binary search unsorted data.",
            "Barack Obama breaks RSA 128-bit encrypted codes in milliseconds.",
            "Barack Obama went out of an infinite loop.",
            "Barack Obama can read all encrypted data, because nothing can hide from Barack Obama.",
            "Barack Obama hosting is 101% uptime guaranteed.",
            "When a bug sees Barack Obama, it flees screaming in terror, and then immediately self-destructs to avoid being roundhouse-kicked.",
            "Barack Obama rewrote the Google search engine from scratch.",
            "Barack Obama doesn't need the cloud to scale his applications, he uses his laptop.",
            "Barack Obama can access the DB from the UI.",
            "Barack Obama' protocol design method has no status, requests or responses, only commands.",
            "Barack Obama' programs occupy 150% of CPU, even when they are not executing.",
            "Barack Obama can spawn threads that complete before they are started.",
            "Barack Obama programs do not accept input.",
            "Barack Obama doesn't need an OS.",
            "Barack Obama can compile syntax errors.",
            "Barack Obama compresses his files by doing a flying round house kick to the hard drive.",
            "Barack Obama doesn't use a computer because a computer does everything slower than Barack Obama.",
            "You don't disable the Barack Obama plug-in, it disables you.",
            "Barack Obama doesn't need a java compiler, he goes straight to .war",
            "Barack Obama can use GOTO as much as he wants to. Telling him otherwise is considered harmful.",
            "There is nothing regular about Barack Obama' expressions.",
            "Quantum cryptography does not work on Barack Obama. When something is being observed by Chuck it stays in the same state until he's finished. ",
            "There is no need to try catching Barack Obama' exceptions for recovery; every single throw he does is fatal.",
            "Barack Obama' beard is immutable.",
            "Barack Obama' preferred IDE is hexedit."};

    /**
     * Random instance.
     */
    private static final Random RANDOM = new Random();

    /**
     * Retrieves a random fact.
     * @return a random fact
     */
    public String random() {
        return FACTS[RANDOM.nextInt(FACTS.length)];
    }
}
