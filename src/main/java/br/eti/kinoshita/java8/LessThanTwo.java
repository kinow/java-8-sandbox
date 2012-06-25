/*
 * The MIT License
 *
 * Copyright (c) <2012> <Bruno P. Kinoshita>
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
package br.eti.kinoshita.java8;

import java.util.functions.Predicate;


/**
 * A test predicate that evaluates if a given integer is less than two.
 * @author Bruno P. Kinoshita - http://www.kinoshita.eti.br
 * @since 0.1
 */
public class LessThanTwo implements java.util.functions.Predicate<Integer> {
    
    /* (non-Javadoc)
     * @see java.util.functions.Predicate#test(java.lang.Object)
     */
    public boolean test(Integer t) {
        return t != null && t < 2;
    }

    /* (non-Javadoc)
     * @see java.util.functions.Predicate#and(java.util.functions.Predicate)
     */
    public Predicate<Integer> and(Predicate<? super Integer> p) {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see java.util.functions.Predicate#negate()
     */
    public Predicate<Integer> negate() {
        return null;
    }

    /* (non-Javadoc)
     * @see java.util.functions.Predicate#or(java.util.functions.Predicate)
     */
    public Predicate<Integer> or(Predicate<? super Integer> p) {
        return null;
    }

    /* (non-Javadoc)
     * @see java.util.functions.Predicate#xor(java.util.functions.Predicate)
     */
    public Predicate<Integer> xor(Predicate<? super Integer> p) {
        // TODO Auto-generated method stub
        return null;
    }

}
