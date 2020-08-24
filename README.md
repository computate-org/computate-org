# computate-org-school

## Github organization initialization tasks

The instructor of the ACE course will want to setup a github organization for the team to get started on their training. The Ansible command below will step through each step. 

```bash
cd /usr/local/src/computate-org-school
ansible-playbook instructor.yml -i inventories/computate-laptop/hosts --vault-password-file=inventories/$USER-$HOSTNAME/key
```

