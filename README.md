
# computate-org-school installation

The installation of the project for both development and production in containers is completely automated with Ansible.
Begin by installing both the ansible and python3 packages.

```bash
sudo yum install -y ansible python3 python3-pip
sudo pip3 install psycopg2
```

If psycopg2 does not install, run:

```bash
sudo pip3 install psycopg2-binary
```

## Ansible on older operating systems.

If you have an older operating system that does not yet support python3, you may struggle to deploy the application on OpenShift in the cloud. The OpenShift Ansible modules seem to require python3 as the system library, so I recommend updating your operating system to something more recent, for example CentOS8 or RHEL8.

On older operating systems, to deploy the development applications you might want to configure ansible for python2.

To deploy to OpenShift, you will want to configure ansible to point to python3.

You might update your ansible configuration like this to make it work:

```
sudo vim /etc/ansible/ansible.cfg
```

```
[defaults]
interpreter_python=/usr/bin/python3
```

Your dependencies might be different on an older operating system.

```bash
sudo yum install -y ansible python python-pip
sudo pip install psycopg2
```

## Ansible training.

For training on ansible and automation, I recommend the following Red Hat course.
By completing the course and taking the exam, you can be a Red Hat Certified Specialist in Ansible Automation.

https://www.redhat.com/en/services/training/do407-automation-ansible-i

## Github organization initialization tasks

The instructor of the ACE course will want to setup a github organization for the team to get started on their training. The Ansible command below will step through each step. 

```bash
cd /usr/local/src/computate-org-school
ansible-playbook instructor.yml -i inventories/$USER-$HOSTNAME/hosts --vault-password-file=inventories/$USER-$HOSTNAME/key
```

