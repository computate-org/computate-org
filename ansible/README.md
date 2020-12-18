
# Troubleshooting

If you run into the following error regarding libselinux-python, it means that ansible is not configured to use the right python binaries for the system: 

```bash
TASK [computate_medicale : Create the computate-medicale systemd service /usr/lib/systemd/system/regarder-computate-medicale.service.] ***
fatal: [tower2]: FAILED! => {"changed": false, "checksum": "f3bd8010a4e40b12ff20df7db2ad88be82d29abf", "msg": "Aborting, target uses selinux but python bindings (libselinux-python) aren't installed!"}
```

If you are running an older operating system like CentOS7 or RHEL7 which uses Python 2 as the system python, you'll want to make sure ansible is configured for python2 in /etc/ansible/ansible.cfg: 

```ini

[defaults]
interpreter_python=/usr/bin/python
```

If you are running a newer operating system like CentOS8 or RHEL8 which uses Python 3 as the system python, you'll want to make sure ansible is configured for python3 in /etc/ansible/ansible.cfg: 

```ini

[defaults]
interpreter_python=/usr/bin/python3
```

# Running Playboooks

ansible-playbook computate_scolaire_openshift_enUS.yml -i inventories/ctate-call-for-code-2020/hosts --vault-id @prompt
ansible-playbook computate_scolaire_restore.yml -i inventories/ctate-laptop/hosts --vault-id @prompt

# Install prerequisites

Create a Red Hat account at https://developers.redhat.com/

```bash
sudo yum install -y ansible python3 python3-pip docker
sudo pip install pip
sudo pip install openshift kubernetes
sudo systemctl start docker
sudo systemctl enable docker

oc new-app https://github.com/computate-org/computate-scolaire.git --image-stream java:latest

oc create secret generic keystore-properties --from-file=keystore.properties=/usr/local/src/computate-scolaire/config/keystore.properties
oc create secret generic keystore-properties --from-file=server.jks=/home/ctate/computate.org/server.jks
```

# Install Ansible and dnf for python3 supported package management. 

```bash
sudo yum install -y ansible dnf
```

# Install the computate project

```bash
sudo install -d -o $USER -g $USER /usr/local/src/computate
git clone git@github.com:computate-org/computate.git /usr/local/src/computate

install -d /usr/local/src/computate/ansible/inventories/tower2/host_vars/tower2
ansible-vault create /usr/local/src/computate/ansible/inventories/tower2/host_vars/tower2/vault
ansible-playbook install-freeipa-vm.yml -i inventories/tower2/hosts --vault-id @prompt

```

# Setup computer the computate way. 

```bash
ansible-playbook computate-setup-computer.yml -i /usr/local/src/computate/ansible/inventories/$USER-$HOSTNAME/hosts --vault-id @prompt
```

# Install computate-zookeeper on OpenShift

```bash
ansible-playbook install-computate-zookeeper.yml -i /usr/local/src/computate/ansible/inventories/$USER-$HOSTNAME/hosts --vault-id @prompt
```

# Install solr-operator

```bash
ansible-playbook install-solr-operator-src.yml -i /usr/local/src/computate/ansible/inventories/$USER-$HOSTNAME/hosts --vault-id @prompt
```

# Install postgres-operator

```bash
ansible-vault create inventories/$USER-$HOSTNAME/host_vars/$HOSTNAME/vault
ansible-vault edit inventories/$USER-$HOSTNAME/host_vars/$HOSTNAME/vault
ansible-playbook install-postgres-operator-src.yml -i inventories/$USER-$HOSTNAME/hosts --vault-id @prompt
ansible-playbook install-postgres-operator.yml -i /usr/local/src/computate/ansible/inventories/$USER-postgres-operator/hosts -e /usr/local/src/computate/ansible/inventories/$USER-postgres-operator/host_vars/postgres-operator/vault --vault-id @prompt --tags=install
```


# Install Libvirt Server

# Install a FreeIPA Server

```bash
sudo install -d -o $USER -g $USER /usr/local/src/ansible-freeipa
git clone https://github.com/freeipa/ansible-freeipa.git /usr/local/src/ansible-freeipa
install -d ~/.ansible/roles
ln -s /usr/local/src/ansible-freeipa/roles/* ~/.ansible/roles/
install -d ~/.ansible/plugins/modules
ln -s /usr/local/src/ansible-freeipa/plugins/modules/*.py ~/.ansible/plugins/modules/
install -d ~/.ansible/plugins/module_utils
ln -s /usr/local/src/ansible-freeipa/plugins/module_utils/*.py ~/.ansible/plugins/module_utils/
```

# computate-ansible
sudo install -d -o $USER -g $USER /usr/local/src/computate-ansible
git clone git@github.com:computate/computate-ansible.git /usr/local/src/computate-ansible/
install -d /usr/local/src/computate/ansible/inventories/computate/group_vars
install -d /usr/local/src/computate/ansible/inventories/computate/host_vars
install -d /usr/local/src/computate/ansible/inventories/computate/host_vars/RHTE-computate-demo
ansible-vault create /usr/local/src/computate/ansible/inventories/computate/host_vars/RHTE-computate-demo/vault
ansible-vault edit /usr/local/src/computate/ansible/inventories/computate/host_vars/RHTE-computate-demo/vault

# Install VM. 
cd /usr/local/src/computate/ansible
ansible-playbook computate-scolaire-vm.yaml -u ctate
ansible-playbook computate-scolaire-vm.yaml -i inventories/computate/hosts -u $USER --extra-vars "target=tower1" --vault-id @prompt
ansible-playbook --extra-vars "target=tower1 ansible_sudo_pass= ansible_become_pass= ansible_ssh_pass=" computate-scolaire-vm.yaml -u ctate

# Install Ant. 
cd /usr/local/src/computate/ansible
ansible-playbook install-ant.yaml -i inventories/computate/hosts -u demo --extra-vars "target=RHTE-computate-demo" --vault-id @prompt

# Install Zookeeper. 
cd /usr/local/src/computate/ansible
ansible-playbook install-zookeeper.yaml -i inventories/computate/hosts -u demo --extra-vars "target=RHTE-computate-demo" --vault-id @prompt

# Install solr
cd /usr/local/src/computate/ansible
ansible-playbook install-solr.yaml -i inventories/computate/hosts -u demo --extra-vars "target=RHTE-computate-demo" --vault-id @prompt

# Install Bridge Network

the nmcli ansible module is actually broken, so this one doesn't work very well. 

```bash
ansible-playbook install-bridge-network.yml -e @/usr/local/src/computate/ansible/inventories/tower2/host_vars/tower2/vault --vault-id @prompt
```
