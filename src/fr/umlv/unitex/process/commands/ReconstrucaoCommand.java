/*
 * Unitex
 *
 * Copyright (C) 2001-2011 Université Paris-Est Marne-la-Vallée <unitex@univ-mlv.fr>
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA.
 *
 */

package fr.umlv.unitex.process.commands;

import java.io.File;

/**
 * @author Sébastien Paumier
 *  
 */
public class ReconstrucaoCommand extends CommandBuilder {

	public ReconstrucaoCommand() {
		super("Reconstrucao");
	}

	public ReconstrucaoCommand alphabet(File alphabet) {
    protectElement("-a"+alphabet.getAbsolutePath());
    return this;
}

    public ReconstrucaoCommand ind(File s) {
        protectElement(s.getAbsolutePath());
        return this;
    }

    public ReconstrucaoCommand rootDic(File s) {
      protectElement("-r"+s.getAbsolutePath());
      return this;
  }

    public ReconstrucaoCommand dic(File s) {
      protectElement("-d"+s.getAbsolutePath());
      return this;
  }

    public ReconstrucaoCommand fst2(File s) {
      protectElement("-p"+s.getAbsolutePath());
      return this;
  }

    public ReconstrucaoCommand nasalFst2(File s) {
      protectElement("-n"+s.getAbsolutePath());
      return this;
  }

    public ReconstrucaoCommand output(File s) {
      protectElement("-o"+s.getAbsolutePath());
      return this;
  }

}