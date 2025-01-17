/*******************************************************************************
 * Copyright (c) 2023 claas and others.
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0 
 *******************************************************************************/
package org.eclipse.elk.alg.yconstree.p3relative;

/**
 * @author claas
 *
 */
public class OutlineNode {
    
    private double relativeX;
    private double absoluteY;
    private OutlineNode next;
    
    OutlineNode(final double relativeX, final double absoluteY, final OutlineNode next){
        this.setRelativeX(relativeX);
        this.setAbsoluteY(absoluteY);
        this.setNext(next);
    }

    /**
     * @return the absoluteY
     */
    public double getAbsoluteY() {
        return absoluteY;
    }

    /**
     * @param absoluteY the absoluteY to set
     */
    public void setAbsoluteY(final double absoluteY) {
        this.absoluteY = absoluteY;
    }

    /**
     * @return the relativeX
     */
    public double getRelativeX() {
        return relativeX;
    }

    /**
     * @param relativeX the relativeX to set
     */
    public void setRelativeX(final double relativeX) {
        this.relativeX = relativeX;
    }

    /**
     * @return the next
     */
    public OutlineNode getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(final OutlineNode next) {
        this.next = next;
    }
    
    /**
     * @return a string representation of this objects relative coordinates
     */
    public String toString() {
        return "X:" + relativeX + ",  Y:" + absoluteY;
    }
    
    /**
     * 
     * @return if this OutlineNode has no "next"
     */
    public boolean isLast() {
        return next == null;
    }
    
    /**
     * Print a full outline
     */
    public void printFullOutline() {
        System.out.println(this.toString());
        if (!this.isLast()) {
            this.getNext().printFullOutline();
        }
    }
}
