import {assert} from 'chai';
import {EasyLink} from '../src';

const config = {
  host: 'http://localhost:7005',
  serialNumber: '616430016400193'
};

async function generateUser(easyLink: EasyLink) {
  const payload = {
    pin: '150708502',
    nama: 'Eka Juliantara',
    pwd: 0,
    rfid: 0,
    priv: 0,
    tmp: [{
      idx: '0',
      alg_ver: 39,
      template:
          '1E:14:0B:17:13:12:1B:0C:52:7A:51:50:57:56:55:54:4B:4A:49:48:4F:4E:4D:4C:43:42:41:40:47:46:45:44:7B:7A:79:78:7F:7E:7D:7C:73:72:71:70:77:76:75:74:6B:6A:69:68:6F:6E:6D:6C:63:62:61:60:67:66:65:64:1B:1A:19:18:1F:1E:1D:1C:13:12:11:10:17:16:15:14:8B:45:F7:0B:7C:3C:11:51:5B:4D:6D:84:07:06:45:04:3B:38:31:39:3A:37:33:38:22:38:23:3B:3B:26:32:39:24:27:28:26:DF:1C:E9:17:1F:F7:6D:92:7A:1D:3D:0E:FB:C4:CC:CE:C7:C9:C8:F6:2A:68:00:F0:ED:00:96:76:8B:F6:DA:C9:CC:DA:DD:C5:CB:C8:C7:C8:DE:D2:D0:C4:EE:ED:F0:E3:F4:F8:F0:FC:E2:E0:F2:F5:F0:E5:EF:FB:E5:EB:E3:E8:ED:EA:E1:FB:F5:F7:F9:E8:E2:E1:FF:EE:99:9A:99:91:93:89:8B:89:8B:9A:91:82:87:85:81:97:8E:88:8C:87:88:8E:86:96:83:82:81:80:87:86:85:84:BB:BA:B9:B8:BF:BE:BD:BC:B3:B2:B1:B0:CF:32:F4:18:0F:FA:9E:FB:CF:27:95:97:CE:37:9D:9A:3E:22:35:D1:35:34:36:2A:35:7A:10:05:53:52:51:50:57:56:55:54:4B:4A:49:48:4F:4E:4D:4C:43:42:41:40:47:46:45:44:7B:7A:79:78:7F:7E:7D:7C:73:72:71:70:04:2A:F7:05:D9:26:DE:5F:C4:DE:17:C0:AB:A1:31:58:21:17:12:E1:9C:B5:AE:A7:DF:BF:30:CF:13:12:11:10:17:16:15:14:0B:0A:09:08:0F:0E:0D:0C:03:02:01:00:07:06:05:04:3B:3A:39:38:3F:3E:3D:3C:33:32:31:30:B7:46:3D:45:5B:AA:88:58:BF:56:A5:BC:B3:5A:A1:58:57:54:D7:A1:DE:DF:54:4D:CA:7B:28:C1:D3:D2:D1:D0:D7:D6:D5:D4:CB:CA:C9:C8:CF:CE:CD:CC:C3:C2:C1:C0:C7:C6:C5:C4:FB:FA:F9:F8:FF:FE:FD:FC:F3:F2:F1:F0:08:09:0A:0B:14:15:16:17:10:11:12:13:1C:1D:1E:1F:18:19:1A:1B:64:65:66:67:34:61:62:63:6C:6D:2E:12:1D:FC:6B:6B:74:75:89:20:8F:5E:72:73:7C:8D:81:80:87:86:7B:7B:44:B8:B9:B8:BF:1E:42:43:DC:B2:B1:B0:B7:4C:4A:4B:AB:AA:A9:A8:AF:51:52:A3:A3:A2:A1:A0:57:59:5A:A2:1B:5A:59:58:A0:A1:F2:5D:53:52:51:B0:A8:A9:57:54:4B:4A:49:B5:B0:71:4D:4C:43:42:81:BF:B8:45:45:44:7B:7A:8D:87:40:7E:7D:7C:73:32:8E:8F:74:76:75:74:6B:8A:96:C7:6D:6E:6D:6C:63:9E:9E:4A:67:66:65:64:DB:E5:B6:1A:1F:1E:1D:1C:EF:ED:12:50:17:16:15:D4:F4:35:09:08:0F:0E:0D:F1:FC:29:11:00:07:06:C5:FB:84:38:91:38:7F:3F:C1:C3:18:B2:3B:70:36:F6:CA:8B:01:82:A3:B2:2D:D0:D2:93:89:88:DE:8B:CD:D9:DA:DB:24:25:26:27:20:21:22:23:2C:2D:2E:2F:28:D6:D5:CC:D3:CA:C9:C8:28:6A:14:24:22:7A:FB:2D:52:12:37:C4:F6:04:03:0B:C0:0E:2C:08:CE:FC:F3:E5:C9:CF:D4:38:F7:8C:E4:B1:EF:EE:ED:EC:E3:E2:E1:E0:E7:E6:E5:E4:9B:9A:99:98:9F:9E:9D:9C:93:92:91:90:97:96:95:94:8B:8A:89:88:8F:8E:8D:8C:83:82:81:80:87:86:85:84:BB:BA:B9:B8:BF:BE:BD:BC:B3:B2:B1:B0:B7:B6:B5:B4:AB:AA:A9:A8:9F:86:F6:AC:A3:A2:A1:A0:B3:29:1B:95:5B:5A:59:73:5F:5E:5D:5C:83:AF:F0:7B:67:96:05:7F:4B:4A:1A:48:3B:0F:EF:4C:FF:2B:EA:40:47:46:45:44:7B:7A:79:78:B3:9D:36:57:8C:8D:8E:8F:87:FA:27:74:69:6A:69:68:6E:6E:6D:6C:7B:06:22:60:53:16:40:55:43:2B:53:18:2F:36:46:1C:1B:91:58:10:27:3E:4E:14:06:0A:09:08:77:13:BF:27:03:02:01:00:07:06:05:04:4F:7B:9B:38:0B:4E:18:0D:9F:42:0F:01:24:36:35:34:2B:2A:29:28:2F:2E:2D:2C:23:22:21:20:27:26:25:24:DB:DA:D9:D8:DF:DE:DD:DC:D3:D2:D1:D0:D7:D6:D5:D4:CB:CA:C9:C8:CF:CE:CD:CC:C3:C2:C1:C0:C7:C6:C5:C4:FB:FA:F9:F8:FF:FE:FD:FC:F3:F2:F1:F0:F7:F6:F5:F4:EB:EA:E9:E8:EF:EE:ED:EC:E3:E2:E1:E0:E7:E6:E5:E4:9B:9A:99:98:9F:9E:9D:9C:93:92:91:90:97:96:95:94:8B:8A:89:88:8F:8E:8D:8C:83:82:81:80:87:86:85:84:BB:BA:B9:B8:BF:BE:BD:BC:B3:B2:B1:B0:B7:B6:B5:B4:AB:AA:A9:A8:AF:AE:AD:AC:A3:A2:A1:A0:A7:A6:A5:A4:5B:5A:59:58:5F:5E:5D:5C:53:52:51:50:57:56:55:54:4B:4A:49:48:4F:4E:4D:4C:43:42:41:40:47:46:45:44:7B:7A:79:78:7F:7E:7D:7C:73:72:71:70:77:76:75:74:6B:6A:69:68:6F:6E:6D:6C:63:62:61:60:67:66:65:64:1B:1A:19:18:1F:1E:1D:1C:13:12:11:10:17:16:15:14:0B:0A:09:08:0F:0E:0D:0C:03:02:01:00:07:06:05:04:3B:3A:39:38:3F:3E:3D:3C:33:32:31:30:37:36:35:34:2B:2A:29:28:2F:2E:2D:2C:23:22:21:20:27:26:25:24:DB:DA:D9:D8:DF:DE:DD:DC:D3:D2:D1:D0:D7:D6:D5:D4:CB:CA:C9:C8:CF:CE:CD:CC:C3:C2:C1:C0:C7:C6:C5:C4:FB:FA:F9:F8:FF:FE:FD:FC:F3:F2:F1:F0:F7:F6:F5:F4:EB:EA:E9:E8:EF:EE:ED:EC:E3:E2:E1:E0:E7:E6:E5:E4:9B:9A:99:98:9F:9E:9D:9C:93:92:91:90:97:96:95:94:8B:8A:89:88:8F:8E:8D:8C:83:82:81:80:87:86:85:84:BB:BA:B9:B8:BF:BE:BD:BC:B3:B2:B1:B0:B7:B6:B5:B4:AB:AA:A9:A8:AF:AE:AD:AC:A3:A2:A1:A0:A7:A6:A5:A4:5B:5A:59:58:5F:5E:5D:5C:53:52:51:50:57:56:55:54:4B:4A:49:48:4F:4E:4D:4C:43:42:41:40:47:46:45:44:7B:7A:79:78:7F:7E:7D:7C:73:72:71:70:77:76:75:74:6B:6A:69:68:6F:6E:6D:6C:63:62:61:60:67:66:65:64:1B:1A:19:18:1F:1E:1D:1C:13:12:11:10:17:16:15:14:0B:0A:09:08:0F:0E:0D:0C:03:02:01:00:07:06:05:04:3B:3A:39:38:3F:3E:3D:3C:33:32:31:30:37:36:35:34:2B:2A:29:28:2F:2E:2D:2C:23:22:21:20:27:26:25:24:DB:DA:D9:D8:DF:DE:DD:DC:D3:D2:D1:D0:D7:D6:D5:D4:CB:CA:C9:C8:CF:CE:CD:CC:C3:C2:C1:C0:C7:C6:C5:C4:FB:FA:F9:F8:FF:FE:FD:FC:F3:F2:F1:F0:F7:F6:F5:F4:EB:EA:E9:E8:EF:EE:ED:EC:E3:E2:E1:E0:E7:E6:E5:E4:9B:9A:99:98:9F:9E:9D:9C:93:92:91:90:97:96:95:94:8B:8A:89:88:8F:8E:8D:8C:83:82:81:80:87:86:85:84:BB:BA:B9:B8:BF:BE:BD:BC:B3:B2:B1:B0:B7:B6:B5:B4:AB:AA:A9:A8:AF:AE:AD:AC:A3:A2:A1:A0:A7:A6:A5:A4:5B:5A:59:58:5F:5E:5D:5C:53:52:51:50:57:56:55:54:4B:4A:49:48:4F:4E:4D:4C:43:42:41:40:47:46:45:44:7B:7A:79:78:7F:7E:7D:7C:73:72:71:70:77:76:75:74:6B:6A:69:68:6F:6E:6D:6C:63:62:61:60:67:66:65:64:1B:1A:19:18:1F:1E:1D:1C:13:12:11:10:17:16:15:14:0B:0A:09:08:0F:0E:0D:0C:03:02:01:00:07:06:05:04:3B:3A:39:38:3F:3E:3D:3C:33:32:31:30:37:36:35:34:2B:2A:29:28:2F:2E:2D:2C:23:22:21:20:27:26:25:24:DB:DA:D9:D8:DF:DE:DD:DC:D3:D2:D1:D0:D7:D6:D5:D4:'
    }]
  };

  easyLink.uploadUser(payload);
}

describe('easylink-js Tests', () => {
  describe('EasyLink', () => {
    const easyLink = new EasyLink(config);

    beforeEach((done) => {
      setTimeout(() => {
        done();
      }, 1000);
    });

    it('should returns proper payload string', () => {
      const payloadString = easyLink.generatePayload(config);

      assert.equal(
          payloadString,
          '?host=http://localhost:7005&serialNumber=616430016400193');
    });

    it('should initializes device successfully', () => {
      assert.doesNotThrow(async () => {
        await easyLink.init();
      });
    });

    it('should returns device info', async () => {
      const deviceInfo = await easyLink.getDeviceInfo();

      assert.hasAllKeys(deviceInfo, [
        'Jam', 'Admin', 'User', 'FP', 'CARD', 'PWD', 'All Operasional',
        'All Presensi', 'New Operasional', 'New Presensi'
      ]);
    });

    it('should returns array of users', async () => {
      const users = await easyLink.getAllUsers();

      assert.isArray(users);
    });

    it('should uploads a user successfully', () => {
      assert.doesNotThrow(async () => {
        await generateUser(easyLink);
      });
    });

    it('should deletes all users on machine', () => {
      assert.doesNotThrow(async () => {
        await easyLink.deleteAllUsers();
      });
    });

    it('should fetches all scan logs successfully', async () => {
      const scanLogs = await easyLink.getAllScanLogs();

      assert.isArray(scanLogs);
    });

    it('should fetches new scan logs successfully', async () => {
      const scanLogs = await easyLink.getNewScanLogs();

      assert.isArray(scanLogs);
    });

    it('should deletes scan logs successfully', () => {
      assert.doesNotThrow(async () => {
        await easyLink.deleteAllScanLogs();
      });
    });

    it('should syncs date/time successfully', () => {
      assert.doesNotThrow(async () => {
        await easyLink.syncDateTime();
      });
    });

    it('should deletes device logs successfully', () => {
      assert.doesNotThrow(async () => {
        await easyLink.deleteDeviceLogs();
      });
    });
  });
});
