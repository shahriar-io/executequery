/*
 * TabView.java
 *
 * Copyright (C) 2002-2015 Takis Diakoumis
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.executequery.base;

/**
 * Possible implementation for panels added to the tab panes.
 * This allows for some cleanup to occur when the panel is removed.
 *
 * @author   Takis Diakoumis
 * @version  $Revision: 1487 $
 * @date     $Date: 2015-08-23 22:21:42 +1000 (Sun, 23 Aug 2015) $
 */
public interface TabView {

    /**
     * Indicates the panel is being removed from the pane.
     *
     * @return true if all ok to proceed, false otherwise
     */
    boolean tabViewClosing();

    /**
     * Indicates the panel is being selected in the pane.
     *
     * @return true if all ok to proceed, false otherwise
     */
    boolean tabViewSelected();

    /**
     * Indicates the panel is being selected in the pane
     *
     *  @return true if all ok to proceed, false otherwise
     */
    boolean tabViewDeselected();

}







