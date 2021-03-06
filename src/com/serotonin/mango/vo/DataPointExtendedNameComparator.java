/*
    Mango - Open Source M2M - http://mango.serotoninsoftware.com
    Copyright (C) 2006-2011 Serotonin Software Technologies Inc.
    @author Matthew Lohbihler
    
    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.serotonin.mango.vo;

import java.util.Comparator;

import com.serotonin.util.StringUtils;

/**
 * @author Matthew Lohbihler
 */
public class DataPointExtendedNameComparator implements Comparator<DataPointVO> {
    public static final DataPointExtendedNameComparator instance = new DataPointExtendedNameComparator();

    public int compare(DataPointVO dp1, DataPointVO dp2) {
        if (StringUtils.isEmpty(dp1.getExtendedName()))
            return -1;
        return dp1.getExtendedName().compareToIgnoreCase(dp2.getExtendedName());
    }
}
