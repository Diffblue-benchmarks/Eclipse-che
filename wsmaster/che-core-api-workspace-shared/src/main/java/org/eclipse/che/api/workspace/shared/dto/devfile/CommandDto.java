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

import java.util.List;
import java.util.Map;
import org.eclipse.che.api.core.model.workspace.devfile.Command;

/** @author Sergii Leshchenko */
public interface CommandDto extends Command {
  @Override
  String getName();

  void setName(String name);

  CommandDto withName(String name);

  @Override
  List<ActionDto> getActions();

  void setActions(List<ActionDto> actions);

  CommandDto withActions(List<ActionDto> actions);

  @Override
  Map<String, String> getAttributes();

  void setAttributes(Map<String, String> attributes);

  CommandDto withAttributes(Map<String, String> attributes);
}
