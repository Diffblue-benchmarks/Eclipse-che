/*
 * Copyright (c) 2012-2018 Red Hat, Inc.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *   Red Hat, Inc. - initial API and implementation
 */
package org.eclipse.che.api.workspace.shared.dto.devfile;

import org.eclipse.che.api.core.model.workspace.devfile.Action;

/** @author Sergii Leshchenko */
public interface ActionDto extends Action {
  @Override
  String getType();

  void setType(String type);

  ActionDto withType(String type);

  @Override
  String getComponent();

  void setComponent(String component);

  ActionDto withComponent(String component);

  @Override
  String getCommand();

  void setCommand(String command);

  ActionDto withCommand(String command);

  @Override
  String getWorkdir();

  void setWorkdir(String workdir);

  ActionDto withWorkdir(String workdir);
}
