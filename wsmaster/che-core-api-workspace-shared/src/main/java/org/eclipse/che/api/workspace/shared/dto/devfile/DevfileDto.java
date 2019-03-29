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
import org.eclipse.che.api.core.model.workspace.devfile.Devfile;

/** @author Sergii Leshchenko */
public interface DevfileDto extends Devfile {
  @Override
  String getSpecVersion();

  void setSpecVersion(String specVersion);

  DevfileDto withSpecVersion(String specVersion);

  @Override
  String getName();

  void setName(String name);

  DevfileDto withName(String name);

  @Override
  List<ProjectDto> getProjects();

  void setProjects(List<ProjectDto> projects);

  DevfileDto withProjects(List<ProjectDto> projects);

  @Override
  List<ComponentDto> getComponents();

  void setComponents(List<ComponentDto> components);

  DevfileDto withComponents(List<ComponentDto> components);

  @Override
  List<CommandDto> getCommands();

  void setCommands(List<CommandDto> commands);

  DevfileDto withCommands(List<CommandDto> commands);

  @Override
  Map<String, String> getAttributes();

  void setAttributes(Map<String, String> attributes);

  DevfileDto withAttributes(Map<String, String> attributes);
}
