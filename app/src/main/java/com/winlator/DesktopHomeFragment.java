package com.winlator;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import java.util.Locale;

public class DesktopHomeFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.desktop_home_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        AppCompatActivity activity = (AppCompatActivity) requireActivity();
        if (activity.getSupportActionBar() != null) {
            activity.getSupportActionBar().setTitle(R.string.pocket_app_name);
        }

        TextView deviceSummary = view.findViewById(R.id.TVDeviceSummary);
        deviceSummary.setText(buildDeviceSummary());

        view.findViewById(R.id.BTWindowsApps).setOnClickListener(v ->
            getParentFragmentManager().beginTransaction()
                .replace(R.id.FLFragmentContainer, new ContainersFragment())
                .addToBackStack(null)
                .commit()
        );

        view.findViewById(R.id.BTLinuxApps).setOnClickListener(v ->
            Toast.makeText(requireContext(), R.string.pocket_linux_locked, Toast.LENGTH_SHORT).show()
        );

        view.findViewById(R.id.BTAdvancedSettings).setOnClickListener(v ->
            getParentFragmentManager().beginTransaction()
                .replace(R.id.FLFragmentContainer, new SettingsFragment())
                .addToBackStack(null)
                .commit()
        );
    }

    private String buildDeviceSummary() {
        ActivityManager activityManager = (ActivityManager) requireContext().getSystemService(Context.ACTIVITY_SERVICE);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        long totalRamGb = Math.max(1L, Math.round(memoryInfo.totalMem / 1073741824.0));
        String abi = Build.SUPPORTED_ABIS.length > 0 ? Build.SUPPORTED_ABIS[0] : "unknown";

        return String.format(
            Locale.getDefault(),
            "%s %s · Android %s · %s · ~%d GB RAM",
            Build.MANUFACTURER,
            Build.MODEL,
            Build.VERSION.RELEASE,
            abi,
            totalRamGb
        );
    }
}
