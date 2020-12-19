#!/bin/bash

{% for FILE in PROJECT.PROJECT_FILES %}
touch {{ FILE.path }}
{% endfor %}
